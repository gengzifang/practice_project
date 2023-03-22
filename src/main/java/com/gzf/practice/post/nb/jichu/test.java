// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   test.java

package com.gzf.practice.post.nb.jichu;;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;

public class test
{

    public test()
    {
    }

    public static void main(String args[])
    {
        System.out.println(System.currentTimeMillis());
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println((new Date()).getTime());
    }
}
