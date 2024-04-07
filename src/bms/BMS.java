package bms;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
public class BMS {

  
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            System.out.println(con);
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(BMS.class.getName()).log(Level.SEVERE,null,ex);
        }
        catch(SQLException ex){
            Logger.getLogger(BMS.class.getName()).log(Level.SEVERE,null,ex);
        }
                    
    }
    
}
