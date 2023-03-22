// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   thread3.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

public class thread3
    implements Runnable
{

    public thread3()
    {
        tickName = 10;
    }

    public void run()
    {
        while(tickName > 0) 
        {
            try
            {
                Thread.sleep(200L);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println((new StringBuilder()).append(Thread.currentThread().getName()).append("-->\u62FF\u5230\u4E86\u7B2C").append(tickName--).append("\u5F20\u7968").toString());
        }
    }

    public static void main(String args[])
    {
        thread3 thread3 = new thread3();
        (new Thread(thread3, "\u5F20\u4E09")).start();
        (new Thread(thread3, "\u674E\u56DB")).start();
        (new Thread(thread3, "\u738B\u4E94")).start();
    }

    private int tickName;
}
