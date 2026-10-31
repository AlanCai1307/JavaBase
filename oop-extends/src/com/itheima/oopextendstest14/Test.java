package com.itheima.oopextendstest14;

import org.openjdk.jol.vm.VM;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();

        // 利用第三方工具，获取对象真实的内存地址  623897750  19680
        System.out.println("对象z在内存中真是的内存地址为：" + Long.toHexString(VM.current().addressOf(z)));

        // 键盘录入，目的是为了程序不停止
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}

class Fu {
    public void fuShow1(){
        System.out.println("public --- fuShow1方法被执行了~");
    }

    private void fuShow2(){
        System.out.println("private --- fuShow2方法被执行了~");
    }
}

class Zi extends Fu {

    public void ziShow(){
        System.out.println("public --- ziShow方法被执行了~");
    }

    @Override
    public void fuShow1(){
        System.out.println("子类重写的fuShow1方法被执行了~");
    }

}