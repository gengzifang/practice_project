// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestDaemon.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

class You1
    implements Runnable
{

    You1()
    {
    }

    public void run()
    {
        for(int i = 0; i < 36500; i++)
            System.out.println((new StringBuilder()).append("\u4E00\u751F\u5F00\u5FC3\u7684\u6D3B\u7740 ").append(i).toString());

        System.out.println("hello word");
    }
}
