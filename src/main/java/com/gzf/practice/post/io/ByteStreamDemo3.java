// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ByteStreamDemo3.java

package com.gzf.practice.post.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3
{

    public ByteStreamDemo3()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        FileOutputStream fos = new FileOutputStream("D:\\study\\jichu\\src\\com\\gzf\\io\\a.txt", true);
        String str = "sijkhasdkjhadskasjd";
        byte bytes[] = str.getBytes();
        fos.write(bytes);
        String wrap = "\r\n";
        byte bytes2[] = wrap.getBytes();
        fos.write(bytes2);
        String str1 = "666";
        byte bytes1[] = str1.getBytes();
        fos.write(bytes1);
        fos.close();
    }
}
