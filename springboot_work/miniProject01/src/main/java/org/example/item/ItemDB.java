package org.example.item;

import org.example.DBInfo;
import org.example.util.Login;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDB {
    private ItemCLI icli = new ItemCLI();
    public void insert() throws SQLException {
        System.out.println("상품등록 기능 만들계획");
        Item item = icli.inputItem();

        Connection con = null; // db연결객체
        PreparedStatement pstmt = null; // sql 문장 담기

        try {
            con = DriverManager.getConnection(DBInfo.url, DBInfo.user, DBInfo.password);
            pstmt = con.prepareStatement("INSERT INTO item (reg_time, update_time, created_by, modified_by, item_detail, item_nm, item_sell_status, price, stock_number) " +
                    "VALUES " +
                    "( NOW(), NOW(), ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, Login.getName());
            pstmt.setString(2, Login.getName());
            pstmt.setString(3, item.getItem_detail());
            pstmt.setString(4, item.getItem_nm());
            pstmt.setString(5, item.getItem_sell_status());
            pstmt.setInt(6, item.getPrice());
            pstmt.setInt(7, item.getStock_number());
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            con.close();
            pstmt.close();
        }
    }
    public void select (){
        List<Item> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(DBInfo.url, DBInfo.user, DBInfo.password);
            pstmt = con.prepareStatement("SELECT * FROM item");
            rs = pstmt.executeQuery();
            while (rs.next()){
                list.add(
                        new Item(
                                rs.getLong("item_id"),
                                rs.getString("reg_time"),
                                rs.getString("update_timne"),
                                rs.getString("create_time"),
                                rs.getString("modified_by"),
                                rs.getString("item.nm"),
                                rs.getString("item_detail"),
                                rs.getString("item_sell_status"),
                                rs.getInt("price"),
                                rs.getInt("stock_number")
                                )
                );
            }
            System.out.println(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
                pstmt.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
