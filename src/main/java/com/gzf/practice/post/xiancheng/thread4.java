// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   thread4.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

public class thread4
    implements Runnable
{

    public thread4()
    {
    }

    public void run()
    {
        System.out.println((new StringBuilder()).append("\u7EBF\u7A0B").append(Thread.currentThread().getName()).toString());
    }

    public static void main(String args[])
    {
        thread4 thread4 = new thread4();
        (new Thread(thread4, "1")).start();
        (new Thread(thread4, "2")).start();
        (new Thread(thread4, "3")).start();
    }
}
