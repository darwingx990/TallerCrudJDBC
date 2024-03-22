package database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    //    public static Connection objConnection = null;
       public static Connection connection = null;
    public static Connection openConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://bdpfbvdpmfqgsfms0lll-mysql.services.clever-cloud.com:3306/bdpfbvdpmfqgsfms0lll";
            String user = "uq2qxdnux8c3kcks";
            String password = "znEyPrXvWTeBJPCvCmWI";

            connection = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Conectado exitosamente");

        } catch (SQLException error) {
            System.out.println("Unable to connect to DB: " + error.getMessage());

        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Unable to find Driver: "+e.getMessage());
        }
        return connection;

    }

    public static void closeConnection(){
//            Connection connection = openConnection();
        try {
            if (connection != null){
                connection.close();
                JOptionPane.showMessageDialog(null, "Connection closed successfully.");
            }else{
                JOptionPane.showMessageDialog(null, "There is no DB opened. ");
            }
        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, "Error at closing the connection: "+error.getMessage());
        }
//        return connection;
    }
}