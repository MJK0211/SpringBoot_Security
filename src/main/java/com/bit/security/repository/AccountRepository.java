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

//    public Account save(Account account, Authority authority ) {
//        accountMapper.insertUser(account);
//        accountMapper.insertUserAuthority(authority);
//        return account;
//    }

    public Account findById(String username) {
        return accountMapper.readAccount(username);
    }

//    public List<String>findauthoritiesbyid(String username){
//        return (List<String>)accountMapper.readAuthorites(username);
//    }
//
//    public Account getUserInfo(String username) {
//        Account account = accountMapper.getFailCnt(username);
//        return account;
//    }
//
//    public void loginFailCnt(String username) {
//        accountMapper.failCntUpdate(username);
//    }
//
//    public void changeEnabled(String username) {
//        accountMapper.changeEnabled(username);
//    }
//
//    public void resetFailCnt(String username) {
//        accountMapper.resetFailCnt(username);
//    }

}