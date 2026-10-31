package com.itheima.oopextendstest6;

public class Test {
    public static void main(String[] args) {
        /*
        第一代手机：
            功能：打电话
        第二代手机：
            功能：打电话，发短信
        第三代手机：
            功能：打电话升级为视频通话，发短信，玩游戏
        */

        // 创建第一代手机的对象
        FirstGenerationPhone phone1 = new FirstGenerationPhone();
        phone1.call();

        // 创建第二代手机的对象
        SecondGenerationPhone phone2 = new SecondGenerationPhone();
        phone2.call();
        phone2.sendMessge();

        System.out.println("-----------");

        // 创建第三代手机的对象
        ThirdGenerationPhone phone3 = new ThirdGenerationPhone();
        phone3.call();
        phone3.sendMessge();
        phone3.playGame();


    }
}
