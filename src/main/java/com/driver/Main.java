package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly rw;
        rw = new RWOnly();
        rw.setName("abc");
        rw.getName();
    }
}