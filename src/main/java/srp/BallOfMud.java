package srp;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class BallOfMud {
  
  private static final int NUMBER_YOU_FIRST_THOUGH_OF = 0;

  /* Formatting + display
   */
  public String asHtml(double salary) {
    return "<html><body>£"+salary+"</body></html>";
  }
  
  /* Business Logic
   */
  public double calculatePayRise(String user) {
    int currentSalary = getCurrentSalary(user);
    double payRise = (currentSalary * getRpiIncrease()) * NUMBER_YOU_FIRST_THOUGH_OF;
    return payRise;
  }

  private double getRpiIncrease() {
    return 0.05;
  }

  /* Database access
   */
  private int getCurrentSalary(String user) {
    DataSource ds = new SomeDSImpl("joe", user);
    Connection c = ds.getConnection();
    PreparedStatement statement = c.prepareStatement("SELECT SALARY FROM SALARIES WHERE USER = ?");
    statement.execute(user);
    int salary = statement.getResultSet().getInt(0);
    return salary;
  }

}
