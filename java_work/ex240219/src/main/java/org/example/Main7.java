package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main7 {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("ccc.txt"))) {
            bw.write("공부를 하기 위해서는 돈이 많이 필요하다.");
            bw.write("돈돈돈돈");
            bw.newLine();
            bw.write("허허허");
        }catch (Exception e){
            e.printStackTrace();
        }
        try(BufferedReader br = new BufferedReader(new FileReader("ccc.txt"))) {
            while (true) {
                // 한 줄씩 읽어라
                String txt = br.readLine();
                if (txt == null) {
                    break;
                }
                System.out.println(txt);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
