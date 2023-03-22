// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestJoin.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

public class TestJoin
    implements Runnable
{

    public TestJoin()
    {
    }

    public void run()
    {
        for(int i = 0; i < 1000; i++)
            System.out.println((new StringBuilder()).append("\u7EBF\u7A0BVIP\u6765\u4E86").append(i).toString());

    }

    public static void main(String args[])
        throws InterruptedException
    {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
        for(int i = 0; i < 1000; i++)
        {
            if(i == 200)
                thread.join();
            System.out.println((new StringBuilder()).append("Main + ").append(i).toString());
        }

    }
}
