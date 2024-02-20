package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main4 {
    public static void main(String[] args) throws IOException {
        // 현재 경로
        Path fp = Paths.get("nio.txt");

        if(!Files.exists(fp)){
            Files.createFile(fp);

        }
        // 속도는 느리지만 코드가 짧아진다
        Files.write(fp, "문자열을 쓰고싶어요...".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        Files.write(fp, "문자열을 쓰고싶어요...".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        Files.write(fp, "문자열을 쓰고싶어요...".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        List<String> list = Files.readAllLines(fp);
        System.out.println(list);
    }
}
