package com.hendisantika.controller;

import com.hendisantika.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
