package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main5 {
    public static void doA() throws IOException {
        Path file = Paths.get("a.txt");
        BufferedWriter fw = null;


        try {
            fw = Files.newBufferedWriter(file);
            fw.write("A");
            fw.write("Z");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args){
        try {
            doA();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

