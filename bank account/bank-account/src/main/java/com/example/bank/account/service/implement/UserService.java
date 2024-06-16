package com.example.bank.account.service.implement;

import com.example.bank.account.dto.request.UserRequestDto;
import com.example.bank.account.dto.response.UserResponseDto;
import com.example.bank.account.mysql.Account;
import com.example.bank.account.mysql.Users;
import com.example.bank.account.repository.AccountRepository;
import com.example.bank.account.repository.UserRepository;
import com.example.bank.account.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
    public UserRequestDto getUserById(Integer id) {
        Optional<Users> user = userRepository.findById(id);
        UserRequestDto userRequestDto = new UserRequestDto();
        if(user.isPresent()){
            userRequestDto = convertUsersToUserDto(user.get());
        }
        return userRequestDto;
    }

    private UserRequestDto convertUsersToUserDto(Users user) {
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setId(user.getId());
        userRequestDto.setFirstName(user.getFirstName());
        userRequestDto.setLastName(user.getLastName());
        userRequestDto.setMobile(user.getMobile());
        userRequestDto.setEmail(user.getEmail());
        userRequestDto.setGender(user.getGender());
        return userRequestDto;
    }

    @Override
    public List<UserRequestDto> getAllUsers() {
        List<Users> userList = (List<Users>) userRepository.findAll();
        List<UserRequestDto> userRequestDtoList = new ArrayList<>();
        for(Users user : userList){
            UserRequestDto userRequestDto = convertUsersToUserDto(user);
            userRequestDtoList.add(userRequestDto);
        }
        return userRequestDtoList;
    }


    @Override
    @Transactional
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        // data save in Users table
        Users user = new Users();
        user = convertUserDtoToUsers(userRequestDto, user);
        user.setCreatedBy(1);
        user.setCreatedAt(LocalDateTime.now());
        user = userRepository.save(user);

        // save data in account table
        Account account = new Account();
        account.setUserId(user.getId());
        account.setAccountNumber(userRequestDto.getAccountNumber());
        account.setBalance(userRequestDto.getBalance());
        account.setCreatedBy(1);
        account.setCreatedAt(LocalDateTime.now());
        account.setUpdatedBy(1);
        account.setUpdatedAt(LocalDateTime.now());
        accountRepository.save(account);

        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setUsername(account.getUsername());
        userResponseDto.setBalance(account.getBalance());
        return userResponseDto;
    }

    private Users convertUserDtoToUsers(UserRequestDto userRequestDto, Users user) {
        user.setFirstName(userRequestDto.getFirstName());
        user.setLastName(userRequestDto.getLastName());
        user.setMobile(userRequestDto.getMobile());
        user.setGender(userRequestDto.getGender());
        user.setEmail(userRequestDto.getEmail());
        user.setUpdatedBy(1);
        user.setUpdatedAt(LocalDateTime.now());
        user.setDateOfBirth(userRequestDto.getDateOfBirth());
        return user;
    }

    @Override
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserRequestDto updateUser(UserRequestDto userRequestDto) {
        Optional<Users> usersOptional = userRepository.findById(userRequestDto.getId());
        if(usersOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDto.getId() + " not found");
        } else {
            Users user = convertUserDtoToUsers(userRequestDto, usersOptional.get());
            user.setId(userRequestDto.getId());
            user = userRepository.save(user);
            return convertUsersToUserDto(user);
        }
        return userRequestDto;
    }

    @Override
    public Users partialUpdateUser(Integer id, Map<String, Object> updates) {
        Optional<Users> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()){
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
                    case "aadharNumber":
                        user.setAadharNumber((String) value);
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
        }else {
            return null;
        }
    }

}
