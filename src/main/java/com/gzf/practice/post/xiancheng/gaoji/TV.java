// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPC2.java

package com.gzf.practice.post.xiancheng.gaoji;

import java.io.PrintStream;

class TV
{

    TV()
    {
        flag = Boolean.valueOf(true);
    }

    public synchronized void play(String voice)
    {
        if(!flag.booleanValue())
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        System.out.println((new StringBuilder()).append("\u6F14\u5458\u8868\u6F14\u4E86: ").append(voice).toString());
        notifyAll();
        this.voice = voice;
        flag = Boolean.valueOf(!flag.booleanValue());
    }

    public synchronized void watch()
    {
        if(flag.booleanValue())
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        System.out.println((new StringBuilder()).append("\u89C2\u770B\u4E86: ").append(voice).toString());
        notifyAll();
        flag = Boolean.valueOf(!flag.booleanValue());
    }

    String voice;
    Boolean flag;
}
