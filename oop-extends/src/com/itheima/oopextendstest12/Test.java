package com.itheima.oopextendstest12;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.name = "aaa";

        // 请问：调用show方法，运行结果是什么？
        z.show();
    }
}


class Fu{
    String name;
}

class Zi extends Fu{
    String name;

    public void show(){
        System.out.println(name + ", " + super.name);// aaa null
    }
}
