package com.itheima.oopextendstest4;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}


class Fu {
    String name = "Fu";
    String address = "南京";

}


class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        // 要求：输出结果为Zi，下面的代码如何书写？
        System.out.println(name);
        System.out.println(this.name);

        // 要求：输出结果为Fu，下面的代码如何书写？
        System.out.println(super.name);

        // 要求：输出结果为南京，下面的代码如何书写？
        System.out.println(address); // 南京
        System.out.println(this.address); // 南京
        System.out.println(super.address); // 南京

    }
}