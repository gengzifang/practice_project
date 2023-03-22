// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CharSetDemo2.java

package com.gzf.practice.post.io;

import java.io.*;

public class CharSetDemo2
{

    public CharSetDemo2()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        FileReader fileReader = new FileReader("D:\\study\\jichu\\src\\com\\gzf\\io\\a.txt");
        int ch = fileReader.read();
        System.out.println((char)ch);
        ch = fileReader.read();
        System.out.println((char)ch);
        ch = fileReader.read();
        System.out.println((char)ch);
        ch = fileReader.read();
        System.out.println((char)ch);
        fileReader.close();
    }
}
