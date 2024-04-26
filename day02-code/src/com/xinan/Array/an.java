package com.xinan.Array;

import java.util.Scanner;

public class an {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数：");
        num = sc.nextInt();
        if(num%2!=1) {
            System.out.println(num +"能被2整除");
        }else System.out.println(num +"不能被2整除");
}

}
