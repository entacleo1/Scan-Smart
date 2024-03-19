
package config;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class dbconnector {
    private Connection connect;
    
   public dbconnector(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/entwakkk", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
   
    //retrieve data
   public ResultSet getData(String sql) throws SQLException{
            Statement stmt = (Statement) connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
    
    
}
