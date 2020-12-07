package com.company;

public class ShouHuoji {
    String color;
    double price;
    String word;
    public void mai(){
        System.out.println("这是一件"+color+"的衣服，价格为"+price+"元");
    }
    public void yifu(String paizi,int num){
        System.out.println("你还想要"+num+"件"+paizi+"？ 你买得起个锤子。");
    }
    public  void say(){
        System.out.println("黑人是不是傻逼？");
    }
}
