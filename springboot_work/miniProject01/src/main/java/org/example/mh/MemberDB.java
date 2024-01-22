package org.example.mh;

import org.example.DBInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {
    public void insert(){
        try {
            Connection conn = DriverManager.getConnection(DBInfo.url);
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO member " +
                                                                "(reg_time, update_time, created_by, modified_by, address, email, name, password, role) " +
                                                                "values" +
                                                                "(now(), now(), '대구', '123@qwe.com', 'aaa', '1234', 'admin'");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("정상종료");
    }
}
