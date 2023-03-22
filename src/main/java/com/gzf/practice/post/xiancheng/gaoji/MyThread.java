// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPool.java

package com.gzf.practice.post.xiancheng.gaoji;

import java.io.PrintStream;

class MyThread
    implements Runnable
{

    MyThread()
    {
    }

    public void run()
    {
        System.out.println((new StringBuilder()).append(Thread.currentThread().getName()).append(" ").toString());
    }
}
