package com.example.utils;

import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 * This is a utility class for making a datasource for the Postgresql DB.
 * The Datasource will be used in a JDBCTemplate.
 *
 * Still looking into why this is needed to make everything work
 *
 * Don't forget to make changes in the application.properties file.
 * @author charlie
 */
public class DataSourceConfig {
    public static DataSource getDataSource(){
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://localhost:3306/springtest");
      dataSource.setUsername("root");
      dataSource.setPassword("root");
      return dataSource;
    }
}
