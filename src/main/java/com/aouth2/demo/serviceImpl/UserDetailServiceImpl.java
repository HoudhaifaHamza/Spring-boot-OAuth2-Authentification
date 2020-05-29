package com.aouth2.demo.serviceImpl;

import com.aouth2.demo.model.CustomUserDetails;
import com.aouth2.demo.model.User;
import com.aouth2.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByEmail(email) ;

        optionalUser.orElseThrow(() -> new UsernameNotFoundException("Email or password wrong"));
        return optionalUser
                .map(CustomUserDetails::new)
                .get();
    }
}
