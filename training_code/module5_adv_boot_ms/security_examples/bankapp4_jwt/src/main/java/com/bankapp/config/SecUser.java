package com.bankapp.config;

import com.bankapp.repo.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class SecUser implements UserDetails {

    private UserEntity userEntity;

    public SecUser(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<String> roles=userEntity.getRoles();
        //somehow u need to createe AL to Array
        String []rolesArray=roles.toArray(new String[roles.size()]);

        return AuthorityUtils.createAuthorityList(rolesArray);
       // return AuthorityUtils.createAuthorityList(userEntity.getRoles());
    }

    @Override
    public String getPassword() {
        return userEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return userEntity.getUsername();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecUser secUser = (SecUser) o;
        return Objects.equals(userEntity, secUser.userEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEntity);
    }
}
