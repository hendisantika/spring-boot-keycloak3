package com.hendisantika.service;

import com.hendisantika.repository.RandomCityRepository;
import com.hendisantika.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
