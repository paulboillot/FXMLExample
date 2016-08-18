/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml.example;

/**
 *
 * @author Paul
 */

/*
Imports
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class FXMLExampleSQLController {
    
    // the class name of the driver to load
    public static final String driver = "com.mysql.jdbc.Driver";
    
    // the connection object
    private static Connection connection;
    
    // connection details
    private static String dbHost = "localhost";
    private static int dbPort = 3306;

    private static String dbUser = "pboillot";
    private static String dbPass = "paj12345";

    // the database
    private static String dbName= "test_data_schema";
    private static String dbTableName = "testdata";
    
    private static void setUpConnection()
    {
        
        try {

            // load the driver
            Class.forName(driver).newInstance();
            System.out.println("Driver loaded successfully.");
        } catch (Exception e) {

            // fail if diver failed to load
            e.printStackTrace();
            System.err.println("Failed to load driver.");
            System.exit(1);
        }

        try {

            // establish a connecton to the database
            connection = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":" + dbPort + "/?user=" + dbUser + "&password=" + dbPass);
            System.out.println("Connected.");

        } catch (Exception e) {

            // fail if unable to connect
            e.printStackTrace();
            System.err.println("Failed to connect to database.");
            System.exit(1);
        }
    }
    
    /*
    * Print method for reading the whole sql table
    */
    public static void print_all_data() throws SQLException
    {
        
        ResultSet rs = get_all_data();
            
        while (rs.next())
        {
            String matter_id = rs.getString("File#");
            String title_co = rs.getString("TitleCo");
            int order_number = rs.getInt("Order#");
            String last_name = rs.getString("Last_Name");
            String condo_detached = rs.getString("C/D");
            String address = rs.getString("Address");
            String city_state_zip = rs.getString("CityStateZip");
            Date closing_date = rs.getDate("Closing");
            String status = rs.getString("Status");
            String attorney = rs.getString("A");

            System.out.println(matter_id + "\t" +
                            title_co + " " + order_number + "\t" + 
                            last_name + "\t" + 
                            condo_detached + "\t" + 
                            address + "\t" +
                            city_state_zip + "\t" +
                            closing_date  + "\t" +
                            status  + "\t" +
                            attorney);
        }
            
        /*
        try
        {
            String query = "SELECT * FROM " + dbName + "." + dbTableName + ";";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            while (rs.next())
            {
                String matter_id = rs.getString("File#");
                String title_co = rs.getString("TitleCo");
                int order_number = rs.getInt("Order#");
                String last_name = rs.getString("Last_Name");
                String condo_detached = rs.getString("C/D");
                String address = rs.getString("Address");
                String city_state_zip = rs.getString("CityStateZip");
                Date closing_date = rs.getDate("Closing");
                String status = rs.getString("Status");
                String attorney = rs.getString("A");
                
                System.out.println(matter_id + "\t" +
                                title_co + " " + order_number + "\t" + 
                                last_name + "\t" + 
                                condo_detached + "\t" + 
                                address + "\t" +
                                city_state_zip + "\t" +
                                closing_date  + "\t" +
                                status  + "\t" +
                                attorney);
            }
        }
        catch (Exception e) {
                    // fail if the query fails
                    e.printStackTrace();
                    System.err.println("Failed to insert a new value into [ " + dbTableName + "]");
                    System.exit(1);
        }
        */
        
        
    }
    
    /*
    * Access method for reading the whole sql table
    */
    public static ResultSet get_all_data() throws SQLException
    {
        try
        {
            String query = "SELECT * FROM " + dbName + "." + dbTableName + ";";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            return rs;
        }
        catch (Exception e) {
                    // fail if the query fails
                    e.printStackTrace();
                    System.err.println("Failed to insert a new value into [ " + dbTableName + "]");
                    System.exit(1);
                    return null;
        } 
        
    }
    
    
    public static void main(String[] args) {

        setUpConnection();
        try
        {
            print_all_data();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        
    }
    
}
