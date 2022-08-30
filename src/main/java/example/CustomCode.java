package example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomCode {
  public void myVulnerability(String password) {
    if (password == null) {
      password = "";
    }
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", password);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void myVulnerability() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void myVulnerability2() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void myVulnerability3() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
