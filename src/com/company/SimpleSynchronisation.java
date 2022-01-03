package com.company;

public class SimpleSynchronisation implements Runnable{
     int value=0;
    private final int range=1000000;
    @Override
    public void run() {

            for(int i=1;i<=range;i++) {
                value = value + 1;
            }

        }
    }

