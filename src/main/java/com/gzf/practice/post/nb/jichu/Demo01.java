// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo01.java

package com.gzf.practice.post.nb.jichu;

import java.io.PrintStream;

public class Demo01
{

    public Demo01()
    {
    }

    public static void main(String args[])
    {
        int i = 10;
        int i2 = 8;
        int i3 = 16;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("=================================");
        float f = 0.1F;
        double d = 0.10000000000000001D;
        System.out.println((double)f == d);
        System.out.println(f);
        System.out.println(d);
        float f1 = 6.514137E+009F;
        float f2 = f1 + 1.0F;
        System.out.println(f1 == f2);
        System.out.println("=================================");
        char c1 = 'b';
        char c2 = '\u56FD';
        System.out.println(c1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c2);
        System.out.println("=================================");
        String h1 = new String("hello world");
        String h2 = new String("hello world");
        System.out.println(h1 == h2);
        String h3 = "hello world";
        String h4 = "hello world";
        System.out.println(h3 == h4);
        System.out.println("=================================");
        Boolean flag = Boolean.valueOf(true);
        Boolean flag1 = Boolean.valueOf(false);
        if(flag.booleanValue())
            System.out.println("flag\u4E3A\u771F");
    }
}
