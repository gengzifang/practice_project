// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ByteStreamDemo4.java

package com.gzf.practice.post.io;

import java.io.*;

public class ByteStreamDemo4
{

    public ByteStreamDemo4()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\Desktop\\casual\\004bb8d5a55b409a335f3fe8df7edb4a.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\Desktop\\casual\\xpg\\renying.mp4");
        int b;
        while((b = fis.read()) != -1) 
            fos.write(b);
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("=====\u5B8C\u6210=====");
    }
}
