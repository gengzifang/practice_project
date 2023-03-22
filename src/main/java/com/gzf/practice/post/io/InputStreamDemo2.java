// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InputStreamDemo2.java

package com.gzf.practice.post.io;

import java.io.*;

public class InputStreamDemo2
{

    public InputStreamDemo2()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        FileInputStream fos = new FileInputStream("D:\\study\\jichu\\src\\com\\gzf\\io\\a.txt");
        int b;
        while((b = fos.read()) != -1) ;
        int num1 = 0;
        for(int i = 1; i <= 200; i++)
            num1 += i;

        int num = 20100;
        System.out.println(num);
        System.out.println(num1);
    }
}
