package com.itheima.oopextendstest5;

public class Test {
    public static void main(String[] args) {
        // 情况一：外界创建子类的对象，并调用方法
        Zi1 z = new Zi1();
        z.drink();
    }
}

class Fu{
    public void eat(){
        System.out.println("吃米饭，吃菜~");
    }
    public void drink(){
        System.out.println("喝开水");
    }
}

class Zi1 extends Fu{
    // 情况二：本类中，调用其他方法
    public void lunch(){
        // 吃米饭，吃菜，喝开水
        eat(); // this.eat();
        drink(); // this.drink();
        System.out.println("------------------");
        super.eat();
        super.drink();
    }
}

class Zi2 extends Fu{

}