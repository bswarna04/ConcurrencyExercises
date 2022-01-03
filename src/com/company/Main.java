package com.company;

//public class Main extends MyThread{
public class Main  {

    public static void main(String[] args) throws InterruptedException {
    /* // Creating and joining threads

        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();
        MyThread thread3=new MyThread();
        MyThread thread4=new MyThread();
        MyThread thread5=new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();   */
        SimpleSynchronisation ss = new SimpleSynchronisation();
        Thread t1 = new Thread(ss, "Thread1");
        Thread t2 = new Thread(ss, "Thread2");
        t1.start();
        t2.start();
        // t1.join();
        // t2.join();
        System.out.println(ss.value);

    }
}