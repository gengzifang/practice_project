// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestDemo01.java

package com.gzf.practice.post.nb.xunhuan;

import java.io.PrintStream;

public class TestDemo01
{

    public TestDemo01()
    {
    }

    public static void main(String args[])
    {
        int count = 0;
        for(int i = 0; i <= 5; i++)
        {
            for(int j = 5; j >= i; j--)
                System.out.print(" ");

            for(int j = 1; j <= i; j++)
                System.out.print("*");

            for(int j = 1; j < i; j++)
                System.out.print("*");

            System.out.println();
        }

    }
}
