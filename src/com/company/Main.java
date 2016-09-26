package com.company;

import com.addition.Tester;

public class Main {

    public static void main(String[] args) {
	    Hobby h = new Hobby();
        h.setFields(3,"Hobby's name",34.456f);
        h.printFields();

        Tester t = new Tester();
        t.setHobbyFields();
        t.printHobbyFields();
    }
}
