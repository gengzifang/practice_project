// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ByteStreamDemo2.java

package com.gzf.practice.post.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2
{

    public ByteStreamDemo2()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        FileOutputStream fos = new FileOutputStream("D:\\study\\jichu\\src\\com\\gzf\\io\\a.txt");
        byte bytes[] = {
            97, 98, 99, 100, 101
        };
        fos.write(bytes, 0, 2);
        fos.close();
    }
}
