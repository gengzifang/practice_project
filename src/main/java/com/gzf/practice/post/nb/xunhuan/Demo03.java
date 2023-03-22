// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo03.java

package com.gzf.practice.post.nb.xunhuan;

import java.io.PrintStream;

public class Demo03
{

    public Demo03()
    {
    }

    public static void main(String args[])
    {
        for(int i = 0; i < 100;)
            if(++i % 10 == 0)
                System.out.println();
            else
                System.out.print((new StringBuilder()).append(i).append(",").toString());

    }
}
