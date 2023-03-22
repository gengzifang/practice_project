// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPriority.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

class MyPriority
    implements Runnable
{

    MyPriority()
    {
    }

    public void run()
    {
        System.out.println((new StringBuilder()).append(Thread.currentThread().getName()).append("-->").append(Thread.currentThread().getPriority()).toString());
    }
}
