// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo04.java

package com.gzf.practice.post.nb.array;

import java.io.PrintStream;

public class Demo04
{

    public Demo04()
    {
    }

    public static void main(String args[])
    {
        int arrays[][] = {
            {
                1, 2, 3, 4, 5
            }, {
                6, 7, 8, 9, 10
            }, {
                11, 12, 13, 14, 15
            }
        };
        System.out.println(arrays[0][4]);
    }
}
