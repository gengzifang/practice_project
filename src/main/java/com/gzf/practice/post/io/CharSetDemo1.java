// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CharSetDemo1.java

package com.gzf.practice.post.io;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1
{

    public CharSetDemo1()
    {
    }

    public static void main(String args[])
        throws UnsupportedEncodingException
    {
        String str = "\u5415\u8F89";
        byte bytes[] = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte bytes1[] = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));
        String s = new String(bytes);
        System.out.println(s);
        String s1 = new String(bytes1, "GBK");
        System.out.println(s1);
    }
}
