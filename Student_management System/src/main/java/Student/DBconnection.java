/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.DBconnection to edit this template
 */
package Student;

/**
 *
 * @author sonal mishra
 */
import java.sql.*;


public class DBconnection {
     
    static Statement stmt=null;
    static Connection con; 
    public static Connection createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String USER="root";
            String PASS="Sonal7530";
            String url = "jdbc:mysql://localhost:3306/b'dataset'?zeroDateTimeBehavior=CONVERT_TO_NULL";

            con= DriverManager.getConnection(url,USER,PASS);
           

        }
        catch(ClassNotFoundException | SQLException ex){
        }

        return con;
    }
    
	      
		
	
   }

