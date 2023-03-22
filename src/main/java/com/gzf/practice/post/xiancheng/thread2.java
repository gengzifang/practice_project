// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   thread2.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

public class thread2
    implements Runnable
{

    public thread2()
    {
    }

    public void run()
    {
        for(int i = 0; i < 10; i++)
            System.out.println((new StringBuilder()).append("run\u65B9\u6CD5").append(i).toString());

    }

    public static void main(String args[])
    {
        thread2 thread2 = new thread2();
        (new Thread(thread2)).start();
        for(int i = 0; i < 10; i++)
            System.out.println((new StringBuilder()).append("main\u65B9\u6CD5").append(i).toString());

    }
}
