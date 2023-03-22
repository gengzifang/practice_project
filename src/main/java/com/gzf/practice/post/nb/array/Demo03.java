// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo03.java

package com.gzf.practice.post.nb.array;

import java.io.PrintStream;

public class Demo03
{

    public Demo03()
    {
    }

    public static void main(String args[])
    {
        int arrays[] = {
            1, 2, 3, 4, 5
        };
        test(arrays);
        System.out.println();
        System.out.println("===================");
        int ai[] = test1(arrays);
        int j = ai.length;
        for(int k = 0; k < j; k++)
        {
            int i = ai[k];
            System.out.print((new StringBuilder()).append(i).append(" ").toString());
        }

    }

    public static void test(int arrays[])
    {
        int ai[] = arrays;
        int i = ai.length;
        for(int j = 0; j < i; j++)
        {
            int array = ai[j];
            System.out.print((new StringBuilder()).append(array).append(" ").toString());
        }

    }

    public static int[] test1(int arrays[])
    {
        int result[] = new int[arrays.length];
        int i = 0;
        for(int j = result.length - 1; i < result.length; j--)
        {
            result[j] = arrays[i];
            i++;
        }

        return result;
    }
}
