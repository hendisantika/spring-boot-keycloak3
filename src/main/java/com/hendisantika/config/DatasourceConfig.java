package com.hendisantika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak3
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/05/22
 * Time: 08.48
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.hendisantika.config.repository")
public class DatasourceConfig {
    @Bean
    public DataSource datasource() throws PropertyVetoException {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase dataSource = builder
                .setType(EmbeddedDatabaseType.H2)
                .addScript("sql-scripts/schema.sql")
                .addScript("sql-scripts/data.sql")
                .build();

        return dataSource;
    }
}
