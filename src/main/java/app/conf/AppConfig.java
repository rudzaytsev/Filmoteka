package app.conf;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by rudolph on 14.05.18.
 */
@Configuration
@ComponentScan(basePackages = {"app.services", "app.dao"})
@PropertySource({"classpath:${spring.profiles.active}/application.properties"})
public class AppConfig {

  @Value("${datasource.driver}")
  private String driverClass;

  @Value("${datasource.url}")
  private String url;

  @Value("${datasource.username}")
  private String user;

  @Value("${datasource.password}")
  private String password;

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(driverClass);
    dataSource.setUrl(url);
    dataSource.setUsername(user);
    dataSource.setPassword(password);
    return dataSource;
  }

  @Bean
  public SpringLiquibase liquibase() {
    SpringLiquibase liquibase = new SpringLiquibase();
    liquibase.setChangeLog("classpath:db/changelog/liquibase-changeLog.xml");
    liquibase.setDataSource(dataSource());
    return liquibase;
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }


}
