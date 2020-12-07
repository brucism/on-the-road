package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShouHuoji huo=new ShouHuoji();
        huo.color="kill belial";
        huo.price=1300;
        huo.word="是";
        huo.mai();
        Scanner input=new Scanner(System.in);
        System.out.print("你最喜欢什么牌子的衣服？");
        String pinpai=input.next();
        System.out.print("你想要几件？");
        int num=input.nextInt();
        huo.yifu(pinpai,num);
        huo.say();
        String s= input.next();
        if(huo.word.equals(s)){
            System.out.println("我也这么觉得！");
        }else{
            System.out.println("不是个鸡儿");
        }
        }
    }

