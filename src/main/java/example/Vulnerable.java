package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Vulnerable {

  private static Connection doVulnerableCode() {
    try {
      return DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private static void doAnotherVulnerableCode() throws SQLException {
      Connection conn =  DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
      conn.close();
  }
}
