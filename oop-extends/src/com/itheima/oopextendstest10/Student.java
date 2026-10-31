package com.itheima.oopextendstest10;

public class Student {
    String name;
    int age;

    public Student() {
        this("同学",18);
        System.out.println("Student无参构造执行了~");
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}
