package com.company;

import java.util.Scanner;public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Guanli guanli=new Guanli();
        guanli.userName="lgy";
        guanli.password="020324";
//        guanli.showInfo();
        System.out.println("请输入用户名：");
        String name=input.next();
        System.out.println("请输入密码：");
        String pwd=input.next();
        if(guanli.userName.equals(name)&&guanli.password.equals(pwd)){
            System.out.println("请输入新密码：");
            guanli.password=input.next();
        }else{
            System.out.println("用户名和密码不匹配，你没权限修改密码。");
        }
    }
}
