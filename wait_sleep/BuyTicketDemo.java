package com.java.xiaobie.wait_sleep;
/**
 * *@Author：别立学
 * *@Version：1.0
 * *@Date：2022/7/9-17:18
 * *类的描述
 * 
 */

/*     wait 释放锁 sleep 不释放锁 详解
        买票案例
        当程序进行上锁后
         sleep控制下的线程，买票是一一完成，
        当程序休眠后，sleep不会释放锁，
        购票和售票完成后才能继续后面购票售票操作
        顺序执行

         wait控制下的线程,多人买票是同时进行，
        当程序等待时，wait会释放锁，
        后续购票者会涌入，开始同时买票
        同时执行
 */

public class BuyTicketDemo {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                ticket.buy();
            }).start();
        }
    }
}
class Ticket{
    public synchronized void  buy(){
        System.out.println("开始买票");
        try {
            this.wait(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("购票完成");
    }
}
