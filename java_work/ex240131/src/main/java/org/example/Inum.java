package org.example;

import lombok.ToString;

@ToString
public class Inum implements Comparable{
    private int num;

    public Inum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 1002;
    }// 16진수

    @Override
    public boolean equals(Object obj) {
        return this.num == ((Inum)obj).num;
    }

    // Arrays.sort 호출하면 기본형 타입 정렬이 된다.
    // Comparable을 상속받아서 compareTo를 재정의 해야지 객체형타입을 정렬할 수 있다.

    // 오름차순 this.num - 0.num
    // 내림차순 o.num - this.num
    @Override
    public int compareTo(Object o) {
        return this.num - ((Inum) o).num;
    }
}
