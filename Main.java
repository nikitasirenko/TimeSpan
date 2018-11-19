package com.Sirenko;

public class Main {

    public static void main(String[] args) {

        TimeSpan test = new TimeSpan(1, 10);
        System.out.println(test);

        TimeSpan testAdd = new TimeSpan(0, 20);
        test.add(testAdd);
        System.out.println(test);

        TimeSpan testSub = new TimeSpan(1, 10);
        test.sub(testSub);
        System.out.println(test);


        test.mult(3);
        System.out.println(test);


    }
}
