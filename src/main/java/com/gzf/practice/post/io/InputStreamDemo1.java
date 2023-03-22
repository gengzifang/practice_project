// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InputStreamDemo1.java

package com.gzf.practice.post.io;

import java.io.*;

public class InputStreamDemo1
{

    public InputStreamDemo1()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        FileInputStream fos = new FileInputStream("D:\\study\\jichu\\src\\com\\gzf\\io\\a.txt");
        int read = fos.read();
        System.out.print((char)read);
        fos.close();
    }
}
