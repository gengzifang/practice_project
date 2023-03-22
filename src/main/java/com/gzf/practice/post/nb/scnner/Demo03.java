// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo03.java

package com.gzf.practice.post.nb.scnner;

import java.io.PrintStream;
import java.util.Scanner;

public class Demo03
{

    public Demo03()
    {
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0D;
        int m = 0;
        System.out.println("\u8BF7\u8F93\u5165\u6570\u5B57: ");
        while(scanner.hasNextDouble()) 
        {
            double v = scanner.nextDouble();
            m++;
            sum += v;
        }
        System.out.println((new StringBuilder()).append("\u8F93\u5165\u4E86 ").append(m).append(" \u4E2A\u6570\u5B57,").append("\u8FD9\u4E9B\u6570\u5B57\u7684\u548C\u662F: ").append(sum).toString());
        scanner.close();
    }
}
