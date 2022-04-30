package com.typeielts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

import javax.sql.DataSource;

@SpringBootTest
class TypeIeltsApplicationTests {
  @Autowired
  DataSource dataSource;


  @Test
  void contextLoads() throws SQLException {
    System.out.println(dataSource.getClass());
    System.out.println(dataSource.getConnection());
  }

}
