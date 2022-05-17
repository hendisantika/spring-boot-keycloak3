package com.hendisantika.controller;

import com.hendisantika.domain.RandomCity;
import com.hendisantika.domain.User;
import com.hendisantika.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak3
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/05/22
 * Time: 09.02
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/springjwt")
@RequiredArgsConstructor
public class ResourceController {
    private GenericService userService;

    @RequestMapping(value = "/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<RandomCity> getUser() {
        return userService.findAllRandomCities();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }
}
