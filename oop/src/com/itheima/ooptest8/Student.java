package com.itheima.ooptest8;

public class Student {
    // 姓名、年龄、身高、体重。
    private String name;
    private int age;
    private int height;
    private int weight;

    // 针对于每一个私有化的成员变量，提供get/set方法
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setHeight(int height){
       this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    // 成员方法：学习
    public void studu(){
        System.out.println(name + "正在学习~");
    }




}
