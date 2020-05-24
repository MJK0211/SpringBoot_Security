package com.bit.security.service;

import com.bit.security.domain.Account;
import com.bit.security.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class AccountService implements UserDetailsService{

    @Autowired
    AccountRepository accounts;

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("## loadUserByUsername ##");

        Account account = accounts.findById(username);

        if( account == null ) {
            log.debug("## 계정정보가 존재하지 않습니다. ##");
            throw new UsernameNotFoundException(username);
        }
        return account;
    }
}