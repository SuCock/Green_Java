package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // 절대경로
        Path path = Paths.get("C:\\javastudy\\patgdemo.java");
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());
        
        // 현재경로를 상대경로로 작성
        Path curpath = Paths.get("");

        if(curpath.isAbsolute()) {
            System.out.println(curpath);
        }else{
            String temp = curpath.toAbsolutePath().toString();
            System.out.println(temp);
        }

        //절대경로
        //FileOutputStream fos = new FileOutputStream("D:\\Students\\java_work\\ex240220\\bb.dat");

        // 상대경로
        try(FileOutputStream fos = new FileOutputStream("aa.dot")) {
            fos.write(10);
            fos.write(20);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}