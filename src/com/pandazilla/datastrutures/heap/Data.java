package com.pandazilla.datastrutures.heap;

public class Data {

    private int data;

    public Data(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String toString() {
        return Integer.toString(data);
    }
}
