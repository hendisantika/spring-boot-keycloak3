package com.hendisantika.repository;

import com.hendisantika.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak3
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/05/22
 * Time: 08.58
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
