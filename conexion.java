import java.sql.*;

import java.util.logging.*;
import javax.swing.JOptionPane;



public class conexionSQL {

  
    
        
        
	private Connection conectar = null;
        static Statement at;
	public Connection getConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conectar = DriverManager.getConnection("jdbc:mysql://localhost/tratamiento", "root", "");
                        at = conectar.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			
		}
		return conectar;  
    }