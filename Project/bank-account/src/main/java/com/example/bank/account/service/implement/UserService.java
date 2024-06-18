package com.example.bank.account.service.implement;

import com.example.bank.account.dto.request.AccountRequestDto;
import com.example.bank.account.dto.request.UserRequestDto;
import com.example.bank.account.dto.response.AccountResponseDto;
import com.example.bank.account.dto.response.UserPostResponse;
import com.example.bank.account.dto.response.UserResponseDto;
import com.example.bank.account.mysql.Account;
import com.example.bank.account.mysql.Users;
import com.example.bank.account.repository.AccountRepository;
import com.example.bank.account.repository.UserRepository;
import com.example.bank.account.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserResponseDto getUserById(Integer id) {
        Optional<Users> user = userRepository.findById(id);
        UserResponseDto userResponseDto = new UserResponseDto();
        if (user.isPresent()) {
            userResponseDto = convertUsersToUserResponseDto(user.get());
        }
        return userResponseDto;
    }

    private UserResponseDto convertUsersToUserResponseDto(Users user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setFirstName(user.getFirstName());
        userResponseDto.setLastName(user.getLastName());
        userResponseDto.setMobile(user.getMobile());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setDateOfBirth(user.getDateOfBirth());
        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        List<Users> userList = (List<Users>) userRepository.findAll();
        List<UserResponseDto> userRequestDtoList = new ArrayList<>();
        for (Users user : userList) {
            UserResponseDto userRequestDto = convertUsersToUserResponseDto(user);
            userRequestDtoList.add(userRequestDto);
        }
        return userRequestDtoList;
    }

    @Override
    public UserResponseDto deleteUserById(Integer id) {
        Optional<Users> user = userRepository.findById(id);

        if (user.isEmpty()) {
            System.out.println("User Data with id " + id + "not found");
            return null;
        } else {
            userRepository.deleteById(id);
            System.out.println("User Data with id " + id + " deleted successfully");
            return convertUsersToUserResponseDto(user.get());
        }
    }

    @Override
    public UserRequestDto updateUser(UserRequestDto userRequestDto) {
        Optional<Users> userOptional = userRepository.findById(userRequestDto.getId());
        if (userOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            Users user = convertUserDtoToUsers(userRequestDto, userOptional.get());
            user.setId(userRequestDto.getId());
            user = userRepository.save(user);
            return convertUsersToUserDto(user);
        }
        return userRequestDto;
    }


    private Users convertUserDtoToUsers(UserRequestDto userRequestDto, Users user) {
        user.setFirstName(userRequestDto.getFirstName());
        user.setLastName(userRequestDto.getLastName());
        user.setMobile(userRequestDto.getMobile());
        user.setGender(userRequestDto.getGender());
        user.setEmail(userRequestDto.getEmail());
        user.setUsername(userRequestDto.getUsername());
        user.setUpdatedBy(1);
        user.setUpdatedAt(LocalDateTime.now());
        user.setDateOfBirth(userRequestDto.getDateOfBirth());
        return user;
    }

    private UserRequestDto convertUsersToUserDto(Users user) {

        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setId(user.getId());
        userRequestDto.setUsername(user.getUsername());
        userRequestDto.setFirstName(user.getFirstName());
        userRequestDto.setLastName(user.getLastName());
        userRequestDto.setGender(user.getGender());
        userRequestDto.setDateOfBirth(user.getDateOfBirth());
        return userRequestDto;
    }

    @Override
    public Users partialUpdateUser(Integer id, Map<String, Object> updates) {
        Optional<Users> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            updates.forEach((key, value) -> {
                switch (key) {
                    case "firstName":
                        user.setFirstName((String) value);
                        break;
                    case "middleName":
                        user.setMiddleName((String) value);
                        break;
                    case "lastName":
                        user.setLastName((String) value);
                        break;
                    case "mobile":
                        user.setMobile((String) value);
                        break;
                    case "email":
                        user.setEmail((String) value);
                        break;
                    case "age":
                        user.setAge((Integer) value);
                        break;
                    case "dateOfBirth":
                        user.setDateOfBirth((LocalDate) value);
                        break;
                    case "address":
                        user.setAddress((String) value);
                        break;
                    case "created_by":
                        user.setCreatedBy((Integer) value);
                        break;
                    case "updated_by":
                        user.setUpdatedBy((Integer) value);
                        break;
                }
            });
            user.setCreatedAt(LocalDateTime.now());
            user.setUpdatedAt(LocalDateTime.now());
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public UserPostResponse createUser(UserRequestDto userRequestDto) {
        // Below code saves data in users table
        Users user = new Users();
        convertUserDtoToUsers(userRequestDto, user);
        user.setCreatedBy(1);
        user.setCreatedAt(LocalDateTime.now());
        user = userRepository.save(user);

        // Below code saves data in user_credentials table
        Account accounts = new Account();
        accounts.setUserId(user.getId());
        accounts.setAccountHolder(userRequestDto.getAccountHolder());
        accounts.setAccountType(userRequestDto.getAccountType());
        accounts.setRateOfInterest(userRequestDto.getRateOfInterest());
        accounts.setBalance(userRequestDto.getBalance());
        accounts.setCreatedBy(1);
        accounts.setCreatedAt(LocalDateTime.now());
        accounts.setUpdatedBy(1);
        accounts.setUpdatedAt(LocalDateTime.now());

        accountRepository.save(accounts);

        UserPostResponse userPostResponse = new UserPostResponse();
        userPostResponse.setId(user.getId());
        userPostResponse.setUsername(user.getUsername());
        userPostResponse.setAccountType(accounts.getAccountType());
        userPostResponse.setBalance(accounts.getBalance());
        return userPostResponse;
    }


    // Accounts Methods

    @Override
    public AccountResponseDto getAccountById(Integer userId) {
        Optional<Account> accounts = accountRepository.findById(userId);

        AccountResponseDto accountsGetResponse = new AccountResponseDto();
        if (accounts.isPresent()) {
            accountsGetResponse = convertAccountToUserDtoGetResponse(accounts.get());
        }
        return accountsGetResponse;
    }

    private AccountResponseDto convertAccountToUserDtoGetResponse(Account account) {

        AccountResponseDto accountResponse = new AccountResponseDto();
        accountResponse.setUserId(account.getUserId());
        accountResponse.setHolderName(account.getAccountHolder());
        accountResponse.setAccountType(account.getAccountType());
        accountResponse.setRateOfInterest(account.getRateOfInterest());
        accountResponse.setBalance(account.getBalance());

        return accountResponse;
    }

    @Override
    public List<AccountResponseDto> getAllAccounts() {
        List<Account> accountsList = (List<Account>) accountRepository.findAll();

        List<AccountResponseDto> accountResponseList = new ArrayList<>();
        for (Account accounts : accountsList) {
            AccountResponseDto accountResponse = convertAccountToUserDtoGetResponse(accounts);
            accountResponseList.add(accountResponse);
        }
        return accountResponseList;
    }

    @Override
    public AccountResponseDto deleteAccountsById(Integer id) {
        Optional<Account> accounts = accountRepository.findById(id);

        if (accounts.isEmpty()) {
            System.out.println("User Data with id " + id + "not found");
            return null;
        } else {
            accountRepository.deleteById(id);
            System.out.println("User Data with id " + id + " deleted successfully");
            return convertAccountToUserDtoGetResponse(accounts.get());
        }
    }

    @Override
    public AccountRequestDto updateAccounts(AccountRequestDto accountRequestDto) {
        Optional<Account> accountsOptional = accountRepository.findById(accountRequestDto.getId());
        if (accountsOptional.isEmpty()) {
            System.out.println("User data with id: " + accountRequestDto.getId() + " not found");
        } else {
            Account accounts = convertAccountDtoToUser(accountRequestDto, accountsOptional.get());
            accounts.setId(accountRequestDto.getId());
            accounts = accountRepository.save(accounts);
            return convertAccountToUserDto(accounts);
        }
        return accountRequestDto;
    }

    private AccountRequestDto convertAccountToUserDto(Account accounts) {
        AccountRequestDto accountsRequestDto = new AccountRequestDto();
        accountsRequestDto.setId(accounts.getId());
        accountsRequestDto.setAccountHolder(accounts.getAccountHolder());
        accountsRequestDto.setAccountNumber(accounts.getAccountNumber());
        accountsRequestDto.setRateOfInterest(accounts.getRateOfInterest());
        accountsRequestDto.setBalance(accounts.getBalance());
        return accountsRequestDto;
    }

    private Account convertAccountDtoToUser(AccountRequestDto accountRequestDto, Account account) {
        account.setAccountHolder(accountRequestDto.getAccountHolder());
        account.setAccountType(accountRequestDto.getAccountType());
        account.setRateOfInterest(accountRequestDto.getRateOfInterest());
        account.setBalance(accountRequestDto.getBalance());
        account.setUpdatedBy(1);
        account.setUpdatedAt(LocalDateTime.now());
        return account;
    }


}







