// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   test4.java

package com.gzf.practice.post.nb.jichu;;

import java.io.PrintStream;

public class test4
{

    public test4()
    {
    }

    public static void main(String args[])
    {
        String s = "119900";
        StringBuffer stringBuffer = new StringBuffer("119900");
        StringBuffer replace1 = stringBuffer.replace(4, 6, "22");
        System.out.println(replace1);
        int i = s.indexOf("99");
        if(s.indexOf('c') == -1)
        {
            String replace = s.replace("99", "00");
            System.out.println(replace);
        }
        System.out.println(i);
    }
}
