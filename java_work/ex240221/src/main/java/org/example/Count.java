package org.example;

public class Count {
    private int cnt;

    synchronized public void incre(){
        cnt++;
    }
    synchronized public void decre(){
        cnt--;
    }

    public int getCnt() {
        return cnt;
    }
}
