package org.example;

import java.util.ArrayList;
import java.util.List;

class AA{
    @Override
    public String toString(){
        return "AA{}";
    }
}
class BB extends AA{
    @Override
    public String toString(){
        return "BB{}";
    }
}
class CC extends AA{
    @Override
    public String toString() {
        return "CC{}";
    }
}
public class Main5 {
    public static void main(String[] args) {
        List<AA> AList = new ArrayList<>();

        AList.add(new BB());
        AList.add(new CC());

        if(AList.get(0) instanceof BB){
            BB b1 = (BB) AList.get(0);
        }else if(AList.get(0) instanceof CC){
            CC c1 = (CC) AList.get(0);
        }
        if(AList.get(1) instanceof CC){
            CC c1 = (CC) AList.get(1);
        }
    }
}
