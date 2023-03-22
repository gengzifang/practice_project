// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo02.java

package com.gzf.practice.post.nb.xunhuan;

import java.io.PrintStream;

public class Demo02
{

    public Demo02()
    {
    }

    public static void main(String args[])
    {
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 1; j <= i; j++)
                System.out.print((new StringBuilder()).append(j).append("*").append(i).append("=").append(i * j).append("\t").toString());

            System.out.println();
        }

    }
}
