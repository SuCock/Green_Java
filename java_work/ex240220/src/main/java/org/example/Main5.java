package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main5 {
    public static void main(String[] args) throws IOException {
        Path org = Paths.get("nio.txt");
        if(!Files.exists(org)){
            Files.createFile(org);
        }
        Path dst = Paths.get("niocopy.txt");

        // 파일을 복사해라, 옵셔으로는 존재하면 대체해라
        //Files.copy(org, dst, REPLACE_EXISTING); StandardCopyOption의 static을 import해도 된다.
        Files.copy(org, dst, StandardCopyOption.REPLACE_EXISTING);
        // 파일을 이동해라
        Files.move(Paths.get("aaa.txt"), Paths.get("bbb.txt"), REPLACE_EXISTING);
    }
}
