package com.hcl.employ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection con=DaoConnection.getConnection();
        System.out.println("Connected...");
        String cmd="select * from Employ";
        try {
            PreparedStatement pst=con.prepareStatement(cmd);
            ResultSet rs=pst.executeQuery();
            while(rs.next()) {
                System.out.println("Employ NO  " +rs.getInt("empno"));
                System.out.println("Employ Name "+rs.getString("name"));
                System.out.println("Department "+rs.getString("dept"));
                System.out.println("Designation "+rs.getString("desig"));
                System.out.println("salary "+rs.getInt("basic"));
                System.out.println("---------------------");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
