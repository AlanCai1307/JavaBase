package com.itheima.oopextendstest10;

public class Test {
    public static void main(String[] args) {
       /*
            按照下面的需求书写一个JavaBean
            学生：
                属性：姓名、年龄
            当我们在学校里面不认识一个同学的时候，都会称呼对方：同学
            所以现在认为学生的默认名字为：同学，默认年龄为18岁


            this(): 调用本类的其他构造方法
            细节：
                1. 如果子类中有多个构造方法的时候，不能用this()互动调用，一定要预留一个调用父类的构造方法
                2. 如果构造方法当中写上了this(),就不能再写super()，JVM也不会自动添加super();
                3. 在老版本当中this()只能写在构造方法的第一行，但是在新版本当中去掉了这一限制
       */


        Student stu = new Student();
        System.out.println(stu.name + ", " + stu.age);






    }
}
