package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.data.Student;

public class SecondMain {
    public static void main(String[] args) {
//        int a = 10;
//        int b = a;
//        a = 20;
//        b = 20;
//        System.out.println(a == b);
//        System.out.println(a != b);

//        Student a = new Student("Alex");
//        Student b = a;
//        a.name = "Alexandra";
//        System.out.println(b.name);


        Student a = new Student("Alex");
        Student b = new Student("Alex");

        System.out.println(a == b);
        System.out.println(a != b);


    }
}
