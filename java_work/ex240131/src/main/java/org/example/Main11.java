package org.example;

import java.util.Arrays;

public class Main11 {
    public static void main(String[] args) {
        int arr[] = {30, 10, 20, 50, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Inum brr[] = new Inum[5];
        brr[0] = new Inum(30);
        brr[1] = new Inum(10);
        brr[2] = new Inum(50);
        brr[3] = new Inum(1);
        brr[4] = new Inum(3);

        Arrays.sort(brr); // 람다를 사용하면 더 쉽게 할 수 있다.(람다는 26장)
        System.out.println(Arrays.toString(brr));
    }
}
