// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   thread1.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

public class thread1
{
    static class downloader extends Thread
    {

        public void run()
        {
            System.out.println((new StringBuilder()).append("\u591A\u7EBF\u7A0B").append(getName()).toString());
        }

        public downloader(String name)
        {
            super(name);
        }
    }


    public thread1()
    {
    }

    public static void main(String args[])
    {
        for(int i = 0; i < 10; i++)
        {
            downloader downloader = new downloader((new StringBuilder()).append("\u8C03\u7528").append(i).toString());
            downloader.start();
        }

    }
}
