package org.example;

import org.example.enums.Role;

import java.sql.*;

public class ENUM_STUDY_DB {
    public void insert(){
        System.out.println("enum_study에 insert");
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.0.38/PMH", "root", "1234");
            pstmt = con.prepareStatement("INSERT INTO enum_study (role) VALUES (?)");
            pstmt.setString(1, Role.ADMIN.toString());
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    public void select(){
        System.out.println("enum_study에 select");
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.0.38/PMH", "root", "1234");
            pstmt = con.prepareStatement("SELECT * FROM enum_study");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("======================================================================");
                System.out.println("id = " + rs.getLong("id"));
                System.out.println("role = " + rs.getString("role"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    public void update(int id){
        System.out.println("enum_study에 update");
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.0.38/PMH", "root", "1234");
            pstmt = con.prepareStatement("UPDATE enum_study SET ROLE = ? WHERE id = ?");
            pstmt.setString(1, Role.USER.toString());
            pstmt.setLong(2, id);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }public void delete(int id){
        System.out.println("enum_study에 delete");
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.0.38/PMH", "root", "1234");
            pstmt = con.prepareStatement("DELETE FROM enum_study WHERE id = ?");
            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
