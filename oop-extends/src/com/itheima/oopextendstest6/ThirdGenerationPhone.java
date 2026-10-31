package com.itheima.oopextendstest6;

public class ThirdGenerationPhone extends SecondGenerationPhone{

    // 注解/注释：都是对代码的解释说明
    // 注释：给程序员看的（文字性的内容）
    // 注解：给虚拟机看的
    @Override
    public void call() {
        System.out.println("开启视频~");
        System.out.println("利用手机打电话~");
    }

    public void playGame(){
        System.out.println("利用手机玩游戏~");
    }
}
