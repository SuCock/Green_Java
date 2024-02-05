package org.example.cart;

import org.example.DBInfo;

import java.sql.*;

public class CartDB {
    private CartCLI cartCLI = new CartCLI();
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    public void insert(){
        // 장바구니 만들기
        try {
            con = DriverManager.getConnection(DBInfo.url, DBInfo.user, DBInfo.password);
            pstmt = con.prepareStatement("");
            ResultSet rs = pstmt.executeQuery();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 장바구니 안에 아이템 넣기
    }
}
