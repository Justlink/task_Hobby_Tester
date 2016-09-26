package com.addition;

import com.company.Hobby;

public class Tester {
    public int b;
    public Hobby hobby;

    public void setHobbyFields() {
        hobby = new Hobby();
        hobby.a = 1;
        hobby.name = "name";
        hobby.fl = 1.1f;
    }

    public void printHobbyFields() {
        System.out.println("a="+ hobby.a);
        System.out.println("name="+hobby.name);
        System.out.println("fl="+ hobby.fl);
    }
}
