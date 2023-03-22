// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo05.java

package com.gzf.practice.post.nb.array;

import java.io.PrintStream;
import java.util.Arrays;

public class Demo05
{

    public Demo05()
    {
    }

    public static void main(String args[])
    {
        int a[] = {
            1, 2, 3, 8, 5, 9090, 3145, 301, 13584, 365, 
            233
        };
        paiXv(a);
    }

    public static void paiXv(int a[])
    {
        int temp = 0;
        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = 0; j < a.length - 1 - i; j++)
                if(a[j + 1] < a[j])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

        }

        System.out.println(Arrays.toString(a));
    }

    public static void toStrings(int a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            if(i == 0)
                System.out.print("[");
            if(i == a.length - 1)
                System.out.println((new StringBuilder()).append(a[i]).append("]").toString());
            else
                System.out.print((new StringBuilder()).append(a[i]).append(", ").toString());
        }

    }
}
