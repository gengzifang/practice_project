// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo04.java

package com.gzf.practice.post.nb.method;

import java.io.PrintStream;

public class Demo04
{

    public Demo04()
    {
    }

    public static void main(String args[])
    {
        printMax(new double[] {
            1656513D, 41321D, 13213D, 546132D, 165D, 321D
        });
    }

    public static void printMax(double numbers[])
    {
        if(numbers.length == 0)
        {
            System.out.println("\u6CA1\u6709\u53C2\u6570");
            return;
        }
        double result = numbers[0];
        for(int i = 1; i < numbers.length; i++)
            if(numbers[i] > result)
                result = numbers[i];

        System.out.println((new StringBuilder()).append("\u6700\u5927\u7684\u6570\u662F").append(result).toString());
    }
}
