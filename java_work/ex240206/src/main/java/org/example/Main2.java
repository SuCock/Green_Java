package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ENUM_STUDY_DB enumStudyDb = new ENUM_STUDY_DB();
        Scanner sc  = new Scanner(System.in);

        enumStudyDb.insert();
        enumStudyDb.select();

        System.out.println("수정하고 싶은 id ?");
        int Utmep = sc.nextInt();
        enumStudyDb.update(Utmep);
        enumStudyDb.select();

        System.out.println("삭제하고 싶은 id ?");
        int Dtemp = sc.nextInt();
        enumStudyDb.delete(Dtemp);
        enumStudyDb.select();

    }
}
