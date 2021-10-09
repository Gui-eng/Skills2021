
package session2;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
    public static Connection dbConnect(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Session2", "root", "");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
