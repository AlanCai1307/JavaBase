package com.itheima.oopextendstest1;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();
        s.name = "小诗诗";
        s.age = 19;
        s.grade = "一年级";

        System.out.println(s.name + ", " + s.age + ", " + s.grade);

        s.eat();
        s.study();

        System.out.println("----------------------");

        // 创建老师的对象
        Teacher t = new Teacher();
        t.name = "阿玮老师";
        t.age = 20;
        t.subject = "计算机学科";
        System.out.println(t.name + ", " + t.age + ", " + t.subject);

        t.eat();
        t.teach();
    }
}
