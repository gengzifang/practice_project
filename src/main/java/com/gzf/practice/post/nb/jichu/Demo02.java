// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo02.java

package com.gzf.practice.post.nb.jichu;;

import java.io.PrintStream;

public class Demo02
{

    public Demo02()
    {
    }

    public static void main(String args[])
    {
        int i = 128;
        byte b = (byte)i;
        System.out.println(i);
        System.out.println(b);
        int i2 = 127;
        double d = i;
        System.out.println(i2);
        System.out.println(d);
        System.out.println("=================================");
        System.out.println(21);
        System.out.println(-45);
        System.out.println("=================================");
        char aa = 'a';
        int in = aa + 1;
        System.out.println(aa);
        System.out.println(in);
        System.out.println("=================================");
        int money = 0x3b9aca00;
        int years = 20;
        int total = money * years;
        long total2 = money * years;
        long total3 = (long)money * (long)years;
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }
}
