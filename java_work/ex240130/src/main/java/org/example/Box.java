package org.example;

class Box<T> {
    private T obj;
    @Override
    public String toString() {
        return "BoxT{" +
                "obj=" + obj +
                '}';
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
