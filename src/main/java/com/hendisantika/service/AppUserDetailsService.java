package com.hendisantika.service;

import com.hendisantika.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak3
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/05/22
 * Time: 09.00
 * To change this template use File | Settings | File Templates.
 */
@Component
@RequiredArgsConstructor
public class AppUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;

}
