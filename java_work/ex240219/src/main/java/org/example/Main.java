package org.example;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public Main() {
        fielWriter();
        fielRead();
    }

    private void fielWriter() {
        try {
            // 출력스트림
            FileOutputStream fos = new FileOutputStream("date.dat");
            fos.write(7);
            // 닫지않으면 다른사람이 못쓰니깐
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            // 용량부족 예외처리
            e.printStackTrace();
        }
    }

    private void fielRead() {
        FileInputStream fis = null;
        try {
            // 입력스트림
            fis = new FileInputStream("date.dat");
            int dat = fis.read();
            System.out.println(dat);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            // 오류까 뜨더라도 close가 되어야함으로 finally를 써야한다.
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}