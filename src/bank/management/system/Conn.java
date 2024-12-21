package bank.management.system;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

    Connection connection;
    Statement statement;


    public Conn(){
        try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "password");
        statement = connection.createStatement();    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
