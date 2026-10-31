package com.itheima.oopextendstest7;

public class Phone extends SmartDevice{


    /*
     方法重写的要注意：
        1. 如果父类里面的代码，我一行都不想用，此时把子类中的方法体重新完整写一遍即可
        2. 如果父类里面的代码我还想用，此时我只是在父类的基础上再加其他的逻辑
           此时可以先通过super关键字调用父类的方法得到一个结果，再对这个结果进行操作即可
     */

    @Override
    public double payment(){
        // 调用父类里面的payment方法先计算出商品的价格
        double payment = super.payment();
        payment = payment * 0.9;
        return payment;
    }
}
