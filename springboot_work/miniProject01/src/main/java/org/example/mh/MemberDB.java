package org.example.mh;

import org.example.DBInfo;
import org.example.util.myCLI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDB {
    private myCLI cli = new myCLI();
    public void insert() {
        Member member = cli.inputMember();
        boolean result = findByEmail(member.getEmail());
        if(!result) {
            try {
                Connection conn = DriverManager.getConnection(DBInfo.url, DBInfo.user, DBInfo.password);
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO member " +
                        "(reg_time, update_time, created_by, modified_by, address, email, name, password, role) " +
                        "values" +
                        "(now(), now(), '', '', ?, ?, ?, ?, 'admin'");
                pstmt.setString(1, member.getAddr());
                pstmt.setString(2, member.getEmail());
                pstmt.setString(3, member.getName());
                pstmt.setString(4, member.getPassword());
                pstmt.executeUpdate();
                System.out.println("입력되었습니다.");
            } catch (Exception e) {
                System.out.println("이쪽으로 온다.");
                e.printStackTrace();
            }
        } else {
            System.out.println("중복된 아이디 입니다.");
        }
    }

    public boolean findByEmail(String email) {
        try {
            Connection conn = DriverManager.getConnection(DBInfo.url, DBInfo.user, DBInfo.password);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM member WHERE email = ?");
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // 행이 있으면
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 행이 없으면
        return false;
    }

    public void login() {
        Member member = cli.loginMember();
        try {
            Connection conn = DriverManager.getConnection(DBInfo.url, DBInfo.user, DBInfo.password);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM member WHERE email = ? AND PASSWORD = ?");
            pstmt.setString(1, member.getEmail());
            pstmt.setString(2, member.getPassword());
            ResultSet rs = pstmt.executeQuery();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



















}

