package com.bankapp.config;

import com.bankapp.repo.UserEntity;
import com.bankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //i wnat to check the user details against that username and will convert
        //my user to the user that spring sec understand
        UserEntity userEntity=userService.findByUsername(username);

        if(userEntity==null){
            throw new UsernameNotFoundException("user is not found");
        }
        return new SecUser(userEntity);
    }
}
