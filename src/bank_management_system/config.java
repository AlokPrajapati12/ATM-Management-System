package bank_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class config {
    Connection connection;
    Statement statement;
    public config(){
        try {
          connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system","root","root123");
          statement=connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
