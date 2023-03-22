/*
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestLock.java

package com.gzf.practice.post.syn;

import java.io.PrintStream;
import java.util.concurrent.locks.ReentrantLock;

class TestLock2
        implements Runnable {

    TestLock2() {
        tickNum = 10;
    }

    public void run() {
        _L2:
        lock.lock();
        if (tickNum >= 0) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(tickNum--);
            break ;
        }
        lock.unlock();
        break;
        lock.unlock();
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
        _L1:
    }

    int tickNum;
    private final ReentrantLock lock = new ReentrantLock();
}
*/
