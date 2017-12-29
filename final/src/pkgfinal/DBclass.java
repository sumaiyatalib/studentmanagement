package pkgfinal;

import java.sql.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import javax.swing.table.*;


public class DBclass {

    String conString = "jdbc:mysql://localhost:3306/students";
    String username = "root";
    String password = "";
    
    public boolean add(String name, String last, String seat, String phone, String shift )
    {
     String sql = "INSERT INTO students(FIRST_NAME, LAST_NAME, SEAT, SHIFT, PHONE) VALUES('"+name+"','"+last+"','"+seat+"','"+shift+"','"+phone+"')";  
    
    
    try
    {
     Connection con = DriverManager.getConnection(conString, username, password);    
     Statement s = con.prepareStatement(sql);
     s.execute(sql);
      
     return true;
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    return false;
    }
    
    public DefaultTableModel getData()
    {
        DefaultTableModel dn = new DefaultTableModel();
        dn.addColumn("ID");
        dn.addColumn("NAME");
        dn.addColumn("LAST NAME");
        dn.addColumn("SEAT");
        dn.addColumn("SHIFT");
        dn.addColumn("PHONE");
        
        String sql = "SELECT * FROM students";
        
        try
        {
            Connection con = DriverManager.getConnection(conString, username, password);
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next())
            {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String last = rs.getString(3);
                String seat = rs.getString(4);
                String shift = rs.getString(5);
                String phone = rs.getString(6);
               
                dn.addRow(new String []{id, name, last, seat, shift, phone});
                
            }
            return dn;

        }
        
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return null;
     }
    
    public boolean update(String id, String name, String last, String seat, String shift, String phone)
    {
     String sql = "UPDATE students SET FIRST NAME = '"+name+"'LAST NAME = '"+last+"'SEAT = '"+seat+"'SHIFT = '"+shift+"'PHONE = '"+phone+"'WHERE ID = '"+id+"'";   
     
     try
     {
         Connection con = DriverManager.getConnection(conString, username, password);
         Statement s = con.prepareStatement(sql);
         
         s.execute(sql);
         
         return true;
     }
     
     catch(SQLException ex)
     {
         ex.printStackTrace();
         return false;
     }
    }
    
public boolean delete(String id)
{
    String sql = "DELETE FROM students WHERE ID = '"+id+"'";
    
    try
    {
        Connection con = DriverManager.getConnection(conString, username, password);
        Statement s = con.prepareStatement(sql);
    
        s.execute(sql);
    
        return true;
    }
    
    catch(Exception ex)
    {
        ex.printStackTrace();
        return false;
    }
}
}
