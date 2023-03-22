// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPriority.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

// Referenced classes of package com.gzf.practice.post.xiancheng:
//            MyPriority

public class TestPriority
{

    public TestPriority()
    {
    }

    public static void main(String args[])
    {
        System.out.println((new StringBuilder()).append(Thread.currentThread().getName()).append("-->").append(Thread.currentThread().getPriority()).toString());
        MyPriority myPriority = new MyPriority();
        Thread a1 = new Thread(myPriority, "1");
        Thread a2 = new Thread(myPriority, "2");
        Thread a3 = new Thread(myPriority, "3");
        Thread a4 = new Thread(myPriority, "4");
        Thread a5 = new Thread(myPriority, "5");
        Thread a6 = new Thread(myPriority, "6");
        a1.start();
        a2.setPriority(2);
        a2.start();
        a3.setPriority(8);
        a3.start();
        a4.setPriority(10);
        a4.start();
        a5.setPriority(1);
        a5.start();
        a6.setPriority(7);
        a6.start();
    }
}
