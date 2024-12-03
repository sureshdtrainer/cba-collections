package com.cba.jdbc;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        Connection conn= null;
        PreparedStatement stmt= null;
        ResultSet rs = null;
        String inputValue ="third message";
        try {
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA","");
            System.out.println("Database Connection Successful");

            //stmt = conn.createStatement();
            stmt = conn.prepareStatement("select * from public.messages where text=?");
            stmt.setString(1,inputValue);
           // rs = stmt.executeQuery("select * from public.messages where text='first message'");
            rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("text"));
            }
        } catch (SQLException e) {
            System.out.println("Cannot connection to Database");
        }
        finally{
            try {
            if (rs != null) {
                rs.close();
            }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
