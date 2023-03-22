// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo02.java

package com.gzf.practice.post.nb.scnner;

import java.io.PrintStream;
import java.util.Scanner;

public class Demo02
{

    public Demo02()
    {
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0F;
        System.out.println("\u8BF7\u8F93\u5165\u6574\u6570: ");
        if(scanner.hasNextInt())
        {
            i = scanner.nextInt();
            System.out.println((new StringBuilder()).append("\u6574\u6570\u6570\u636E: ").append(i).toString());
        } else
        {
            System.out.println("\u8F93\u5165\u7684\u4E0D\u662F\u6574\u6570\u6570\u636E!");
        }
        System.out.println("\u8BF7\u8F93\u5165\u5C0F\u6570: ");
        if(scanner.hasNextFloat())
        {
            f = scanner.nextFloat();
            System.out.println((new StringBuilder()).append("\u5C0F\u6570\u6570\u636E: ").append(f).toString());
        } else
        {
            System.out.println("\u8F93\u5165\u7684\u4E0D\u662F\u5C0F\u6570\u6570\u636E!");
        }
        scanner.close();
    }
}
