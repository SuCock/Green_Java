package org.example.cart;

import org.example.DBInfo;
import org.example.util.Login;

import java.sql.*;

public class CartDB {
    private CartCLI cartCLI = new CartCLI();
    Connection con = null;
    PreparedStatement pstmt = null;
    public void insert(){
        // 장바구니 만들기
        try {
            // insert into cart
            // insert into cart_item
            con = DriverManager.getConnection(DBInfo.url, DBInfo.user, DBInfo.password);
            pstmt = con.prepareStatement("INSERT INTO cart (reg_time, update_time, member_id) VALUES (now(), now(), ?)");
            // 로그인한 정보를 가져와야한다.
            pstmt.setLong(1, Login.member.getMember_id());
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e){
            System.out.println("장바구니가 이미 있습니다.");
        } catch (Exception e){
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

    public void insertItem(){
        int item_id = cartCLI.inputItem();
        try {
            // insert into cart
            // insert into cart_item
            con = DriverManager.getConnection(DBInfo.url, DBInfo.user, DBInfo.password);
            pstmt = con.prepareStatement("INSERT INTO cart (count, cart_id, item_id) VALUES (10, 17, ?)");
            // 로그인한 정보를 가져와야한다.
            pstmt.setLong(1, item_id);
            
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e){
            System.out.println("장바구니가 이미 있습니다.");
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
