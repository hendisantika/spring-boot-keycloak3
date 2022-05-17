package com.hendisantika.service;

import com.hendisantika.domain.User;
import com.hendisantika.repository.RandomCityRepository;
import com.hendisantika.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak3
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/05/22
 * Time: 08.59
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class GenericServiceImpl implements GenericService {
    private final UserRepository userRepository;

    private final RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
