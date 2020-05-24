package com.bit.security.mapper;

import com.bit.security.domain.Account;
import com.bit.security.domain.Authority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    Account readAccount(String id);
    List<String> readAuthorites(String id);

}