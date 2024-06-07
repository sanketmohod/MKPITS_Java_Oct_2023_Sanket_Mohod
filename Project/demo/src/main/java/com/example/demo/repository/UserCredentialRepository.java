package com.example.demo.repository;

import com.example.demo.mysql.UserCredential;
import org.springframework.data.repository.CrudRepository;

public interface UserCredentialRepository extends CrudRepository<UserCredential, Integer> {

}
