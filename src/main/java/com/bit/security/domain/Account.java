package com.bit.security.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
public class Account implements UserDetails {

    private String id;
    private String password;
    private int failCnt;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;

    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    // UserDetails의 필수 메서드들
    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.password;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.id;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return this.isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return this.isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return this.isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return this.isEnabled;
    }

}