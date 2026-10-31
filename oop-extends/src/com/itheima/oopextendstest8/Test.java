package com.itheima.oopextendstest8;

import com.itheima.oopextendstest1.Person;
import com.itheima.oopextendstest1.Student;

public class Test {
    public static void main(String[] args) {
       // final 修饰变量、修饰类、修饰方法
        // final修饰类：这个类现在就是最终类，不能被继承。
        // final修饰方法：这个方法是最终的方法，不能被子类重写
    }
}


class Fu{
    public void method(int num){
        System.out.println("method方法执行了~");
    }
}

class Zi extends Fu{
    @Override
    public void method(int num) {
        System.out.println("子类重写的method方法~");
    }
}