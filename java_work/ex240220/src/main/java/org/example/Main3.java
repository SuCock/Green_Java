package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\javastudy\\AA.java");
        Path path2 = Paths.get("C:\\javastudy\\EMPTY");

        Path aa = Paths.get("C:\\aa\\bb\\cc");

        try {
            if(!Files.exists(path)){
                Files.createFile(path);
            }else{
                System.out.println("이미있음");
            }
            if(!Files.exists(path2)){
                Files.createDirectory(path2);
            }else{
                System.out.println("이미있음");
            }
            if(!Files.exists(aa)){
                // 경로에 모든 폴더들을 만들때
                Files.createDirectories(aa);
            }else{
                System.out.println("이미있음");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter fw = new FileWriter(("aaa.txt"))) {
            fw.write("새로운 문자열 입니다.");
            fw.write("\n");
            fw.write("테스트테스트");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
