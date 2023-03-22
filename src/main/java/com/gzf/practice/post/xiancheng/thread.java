// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   thread.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

public class thread extends Thread
{

    public thread()
    {
    }

    public void run()
    {
        for(int i = 0; i < 10; i++)
            System.out.println((new StringBuilder()).append("run\u65B9\u6CD5---").append(i).toString());

    }

    public static void main(String args[])
    {
        thread thread = new thread();
        thread.start();
        for(int i = 0; i < 1000; i++)
            System.out.println((new StringBuilder()).append("main\u65B9\u6CD5---").append(i).toString());

    }
}
