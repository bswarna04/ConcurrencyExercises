package com.company;

public class MyThread extends Thread {


    @Override
    public void run() {

             System.out.println("Hello world !" +currentThread().getName());

        }
    }




