package com.bit.security.repository;

import com.bit.security.domain.Account;
import com.bit.security.domain.Authority;
import com.bit.security.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepository {

    @Autowired
    AccountMapper accountMapper;

    public Account findById(String username) {
        return accountMapper.readAccount(username);
    }

    public List<String>findauthoritiesbyid(String username){
        return (List<String>)accountMapper.readAuthorites(username);
    }

}