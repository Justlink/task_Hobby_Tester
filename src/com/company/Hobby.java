package com.company;

public class Hobby {
    public int a;
    public String name;
    public float fl;
    public void setFields(int a2, String name2, float fl2) {
        a = a2;
        name = name2;
        fl = fl2;
    }

    public void printFields() {
        System.out.println("a=" + a);
        System.out.println("name=" + name);
        System.out.println("fl=" + fl);
    }
}
