import java.sql.*;
public class Main {
    public static void main(String[] args) {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","pwd123");
            System.out.printf("Hello and welcome!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        }
    }
