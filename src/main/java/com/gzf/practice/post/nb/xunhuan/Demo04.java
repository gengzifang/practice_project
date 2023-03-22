// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo04.java

package com.gzf.practice.post.nb.xunhuan;

import java.io.PrintStream;

public class Demo04
{

    public Demo04()
    {
    }

    public static void main(String args[])
    {
        int count = 0;
label0:
        for(int i = 101; i < 150; i++)
        {
            for(int j = 2; j < i; j++)
                if(i % j == 0)
                    continue label0;

            System.out.print((new StringBuilder()).append(i).append(",").toString());
        }

    }
}
