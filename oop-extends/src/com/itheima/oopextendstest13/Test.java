package com.itheima.oopextendstest13;

import org.openjdk.jol.vm.VM;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();

        // 利用第三方工具，获取对象真实的内存地址  623897570    17216
        System.out.println("对象z在内存中真是的内存地址为：" + Long.toHexString(VM.current().addressOf(z)));

        // 键盘录入，目的是为了程序不停止
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}


class Fu {
    private int a = 0x111;
    int b = 0x222;
    static int staticFu = 0x333;

}

class Zi extends Fu {
    private int c = 0x444;
    int d = 0x555;
    static int staticZi = 0x666;

}