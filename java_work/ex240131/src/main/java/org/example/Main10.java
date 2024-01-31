package org.example;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        Inum[] arr = new Inum[3];
        Inum[] brr = new Inum[3];

        arr[0] = new Inum(10);
        arr[1] = new Inum(20);
        arr[2] = new Inum(30);

        brr[0] = new Inum(10);
        brr[1] = new Inum(20);
        brr[2] = new Inum(30);

        System.out.println(arr == brr);
        System.out.println(arr.equals(brr));

        System.out.println(Arrays.equals(arr, brr));
    }
}
