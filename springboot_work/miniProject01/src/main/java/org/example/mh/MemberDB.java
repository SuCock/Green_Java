package org.example.mh;

import org.example.DBInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {
    public void insert(Member member){
        try {
            Connection conn = DriverManager.getConnection(DBInfo.url);
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO member " +
                                                                "(reg_time, update_time, created_by, modified_by, address, email, name, password, role) " +
                                                                "values" +
                                                                "(now(), now(), '', '', '?', '?', '?', '?', 'admin'");
            pstmt.setString(1, member.getAddr());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getName());
            pstmt.setString(4, member.getPassword());

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("정상종료");
    }
}
