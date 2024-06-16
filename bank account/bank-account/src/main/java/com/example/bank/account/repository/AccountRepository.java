package com.example.bank.account.repository;

import com.example.bank.account.mysql.Account;
import com.example.bank.account.mysql.Users;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
