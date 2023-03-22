// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo03.java

package com.gzf.practice.post.nb.jichu;;

import java.io.PrintStream;

public class Demo03
{

    public Demo03()
    {
        s = "hello world";
    }

    public static void main(String args[])
    {
        int i = 5;
        System.out.println(i);
        Demo03 demo03 = new Demo03();
        String s = demo03.s;
        System.out.println(s);
        System.out.println(salary);
        System.out.println(3.1415926000000001D);
        int a = 3;
        int b = a++;
        System.out.println(a);
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    String s;
    static double salary = 2500D;
    static final double PI = 3.1415926000000001D;

}
