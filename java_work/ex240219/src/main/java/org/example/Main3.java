package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main3 {
    public static void main(String[] args) {
        // try안에 적으면 자동으로 close가 된다.
        try(DataOutputStream dos = new DataOutputStream((new FileOutputStream("main3.dat")))) {
            dos.writeInt(10);
            dos.writeDouble(30.4);
        }catch (Exception e){
            e.printStackTrace();
        }
        try(DataInputStream dis = new DataInputStream(new FileInputStream("main3.dat"))) {
            int a = dis.readInt();
            double b = dis.readDouble();
            System.out.println(a);
            System.out.println(b);
            
//            // 8바이트르 읽고
//            double a = dis.readDouble();
//            // 4바이트를 읽어버리면 바이트가 맞지않아
//            // 8바이트로 나온다
//            int b = dis.readInt();
//            System.out.println(a);
//            System.out.println(b);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
