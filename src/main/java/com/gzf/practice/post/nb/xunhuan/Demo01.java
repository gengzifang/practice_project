// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo01.java

package com.gzf.practice.post.nb.xunhuan;

import java.io.PrintStream;

public class Demo01
{

    public Demo01()
    {
    }

    public static void main(String args[])
    {
        int i = 0;
        int sum = 0;
        for(; i <= 100; i++)
            sum += i;

        System.out.println((new StringBuilder()).append("1+2+3+4+........+100= ").append(sum).toString());
        int i1 = 0;
        int sum1 = 0;
        do
            sum1 += i1;
        while(++i1 <= 100);
        System.out.println(sum);
    }
}
