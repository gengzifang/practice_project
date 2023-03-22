// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo06.java

package com.gzf.practice.post.nb.array;

import java.io.PrintStream;

public class Demo06
{

    public Demo06()
    {
    }

    public static void main(String args[])
    {
        int a[][] = new int[11][11];
        a[1][2] = 1;
        a[2][3] = 2;
        System.out.println("\u539F\u59CB\u4E8C\u7EF4\u6570\u7EC4");
        int ai[][] = a;
        int k = ai.length;
        for(int l = 0; l < k; l++)
        {
            int ints[] = ai[l];
            int ai1[] = ints;
            int i1 = ai1.length;
            for(int k1 = 0; k1 < i1; k1++)
            {
                int anInt = ai1[k1];
                System.out.print((new StringBuilder()).append(anInt).append("\t").toString());
            }

            System.out.println();
        }

        int sum = 0;
        for(int i = 0; i < 11; i++)
        {
            for(int j = 0; j < 11; j++)
                if(a[i][j] != 0)
                    sum++;

        }

        System.out.println((new StringBuilder()).append("\u6709\u6548\u4E2A\u6570: ").append(sum).toString());
        int a2[][] = new int[sum + 1][3];
        a2[0][0] = 11;
        a2[0][1] = 11;
        a2[0][2] = sum;
        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
                if(a[i][j] != 0)
                {
                    count++;
                    a2[count][0] = i;
                    a2[count][1] = j;
                    a2[count][2] = a[i][j];
                }

        }

        System.out.println("\u8F6C\u6362\u4E3A\u7A00\u758F\u6570\u7EC4");
        for(int i = 0; i < a2.length; i++)
            System.out.println((new StringBuilder()).append(a2[i][0]).append("\t").append(a2[i][1]).append("\t").append(a2[i][2]).append("\t").toString());

        int a3[][] = new int[a2[0][0]][a2[0][1]];
        for(int i = 1; i < a2.length; i++)
            a3[a2[i][0]][a2[i][1]] = a2[i][2];

        System.out.println("\u8FD8\u539F\u540E\u7684\u4E8C\u7EF4\u6570\u7EC4");
        int ai2[][] = a3;
        int j1 = ai2.length;
        for(int l1 = 0; l1 < j1; l1++)
        {
            int ints[] = ai2[l1];
            int ai3[] = ints;
            int i2 = ai3.length;
            for(int j2 = 0; j2 < i2; j2++)
            {
                int anInt = ai3[j2];
                System.out.print((new StringBuilder()).append(anInt).append("\t").toString());
            }

            System.out.println();
        }

    }
}
