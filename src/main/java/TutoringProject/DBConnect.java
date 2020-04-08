
package TutoringProject;

/**
 *
 * @author mibal
 */
import java.sql.*;

public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            st = con.createStatement();
        }  catch (Exception ex) {
        System.out.println("Error: " + ex);
     
        }
        }    
    
        public void getData() {
            try {
                    String query = "select * from student";
                    rs = st.executeQuery(query);
                    System.out.println("Records from Database");
                    while (rs.next()) {
                    String Username = rs.getString("name");
                    String Address = rs.getString("age");
                    System.out.println("Username: " + Username + " Address: " + Address);
                    }
                } catch(Exception ex) {
                        System.out.println(ex);
                    }
        }
}


