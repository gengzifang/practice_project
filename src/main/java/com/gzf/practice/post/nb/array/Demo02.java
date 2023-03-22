// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo02.java

package com.gzf.practice.post.nb.array;

import java.io.PrintStream;

public class Demo02
{

    public Demo02()
    {
    }

    public static void main(String args[])
    {
        int arrays[] = {
            1, 2, 3, 4, 5
        };
        for(int i = 0; i < arrays.length; i++)
            System.out.print((new StringBuilder()).append(arrays[i]).append(" ").toString());

        System.out.println();
        System.out.println("==============");
        int sum = 0;
        for(int i = 0; i < arrays.length; i++)
            sum += arrays[i];

        System.out.println((new StringBuilder()).append("sum= ").append(sum).toString());
        System.out.println("==============");
        int max = arrays[0];
        for(int i = 0; i < arrays.length; i++)
            if(arrays[i] > max)
                max = arrays[i];

        System.out.println((new StringBuilder()).append("max= ").append(max).toString());
    }
}
