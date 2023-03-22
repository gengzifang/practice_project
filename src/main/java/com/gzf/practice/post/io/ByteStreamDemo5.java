// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ByteStreamDemo5.java

package com.gzf.practice.post.io;

import java.io.*;

public class ByteStreamDemo5
{

    public ByteStreamDemo5()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        FileInputStream fis = new FileInputStream("D:\\study\\jichu\\src\\com\\gzf\\io\\a.txt");
        byte bytes[] = new byte[3];
        int read = fis.read(bytes);
        String s = new String(bytes);
        System.out.println(s);
        int read1 = fis.read(bytes);
        String s1 = new String(bytes);
        System.out.println(s1);
        fis.close();
        System.out.println("=====\u5B8C\u6210=====");
    }
}
