package com.java.xiaobie.bitoperation;

/**
 * *@Author：别立学
 * *@Version：1.0
 * *@Date：2022/7/3-20:02
 * *类的描述
 * 
 */
/*
    关于位运算的一些小知识
 */
public class BitOperation {
    //讲十进制数转化为32位二进制数的方法
    public static void print(int num){
        for (int i = 31; i > 0; i--) {
            System.out.print((num & (1 << i) )== 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //取整型a的最大值：2的31次方-1
        int a=Integer.MAX_VALUE;
        print(a);
        //将a的二进制整体右移一位，
        // 也就是在他的值的基础上÷2
        print(a>>1);
        print(a>>>1);
        //取整数a的最小值：2的31次方
        System.out.println("--------------");
        int b=Integer.MIN_VALUE;
        print(b);
        //在值位负数的时候，
        // b>>的含义为整体右移，
        // 然后将符号位补上
        print(b>>1);
        //b>>>的含义为整体右移，
        // 不考虑符号位，
        // 空的值直接用0补上
        print(b>>>1);

        int c=5;
        //
        int d=-c;
        //-号第二种表达方式
        int e=(~c+1);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("---------------");
        print(~b+1);
        System.out.println(~b + 1);

    }


}
