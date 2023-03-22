// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo05.java

package com.gzf.practice.post.nb.method;

import java.io.PrintStream;

public class Demo05
{

    public Demo05()
    {
    }

    public static void main(String args[])
    {
        System.out.println(test(5));
        System.out.println(120);
    }

    public static int test(int i)
    {
        if(i == 1)
            return 1;
        else
            return i * test(i - 1);
    }
}
