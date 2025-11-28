package bank.management.system;

// import java.sql.Statement;
// import java.sql.Connection;
// import java.sql.DriverManager;
import java.sql.*;

public class conn {
    Connection CONN;
    Statement statement;
    public conn(){
        try {
    CONN= DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","Mugera@19");
           statement=CONN.createStatement(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
