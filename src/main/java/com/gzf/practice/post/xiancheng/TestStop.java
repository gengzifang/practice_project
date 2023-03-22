// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestStop.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

public class TestStop
    implements Runnable
{

    public TestStop()
    {
        flag = Boolean.valueOf(true);
    }

    public void run()
    {
        int i = 0;
        for(; flag.booleanValue(); System.out.println((new StringBuilder()).append("\u7EBF\u7A0B\u6B63\u5728\u8FD0\u884C").append(i++).toString()));
    }

    public void stop()
    {
        flag = Boolean.valueOf(false);
    }

    public static void main(String args[])
    {
        TestStop testStop = new TestStop();
        (new Thread(testStop)).start();
        for(int i = 0; i < 1000; i++)
        {
            System.out.println((new StringBuilder()).append("main").append(i).toString());
            if(i == 900)
            {
                testStop.stop();
                System.out.println("\u7EBF\u7A0B\u505C\u6B62");
            }
        }

    }

    private Boolean flag;
}
