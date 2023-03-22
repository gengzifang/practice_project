// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo01.java

package com.gzf.practice.post.nb.scnner;

import java.io.PrintStream;
import java.util.Scanner;

public class Demo01
{

    public Demo01()
    {
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u4F7F\u7528nextLine\u65B9\u6CD5\u63A5\u6536: ");
        if(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            System.out.println((new StringBuilder()).append("\u8F93\u5165\u7684\u5185\u5BB9\u4E3A: ").append(str).toString());
        }
        scanner.close();
    }
}
