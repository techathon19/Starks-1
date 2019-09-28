import java.sql.*;


import com.mysql.*;
import java.util.*;

import javax.swing.JOptionPane;



public class login{
	Connection conn = null;
	public static Connection dbconnector() {
		try {
			String url="jdbc:mysql://localhost:3306/minipro1";
			String uname="root";
			String pass="VIGN@2000";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn =DriverManager.getConnection(url,uname,pass);

			return conn;
			
		}
		catch (Exception e){
			//JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
}
