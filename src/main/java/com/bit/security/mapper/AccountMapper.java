package com.bit.security.mapper;

import com.bit.security.domain.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    Account readAccount(String id);

}