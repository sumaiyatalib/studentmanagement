package pkgfinal;

import java.sql.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import javax.swing.table.*;


public class function {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    public ResultSet find(String s)
    {
        try
        {
        con = DriverManager.getConnection("jdbc:mysql://localhost/students");
        ps = con.prepareStatement("select * from students where id = ?");
        ps.setString(1, s);
        rs = ps.executeQuery();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
       return rs;
    }
    
}
