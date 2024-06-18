package com.example.bank.account.validator;

import com.example.bank.account.exception.BusinessException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserValidator {
    public boolean validateAge(LocalDate dateOfBirth) throws BusinessException {
        if (dateOfBirth == null) {
            return false;
        } else {
            LocalDate currentDate = LocalDate.now();
            int age = currentDate.getYear() - dateOfBirth.getYear();
            if (age >= 18) {
                return true;
            } else {
                return false;
            }
        }

    }
}
