// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   test2.java

package com.gzf.practice.post.nb.jichu;;

import java.io.PrintStream;

public class test2
{

    public test2()
    {
    }

    public static void main(String args[])
    {
        String city = "\u6CB3\u5317\u7701\u5317\u4EAC\u5E02\u4E1C\u57CE\u533A\u822A\u661F\u79D1\u6280\u56ED8\u53F7\u697C";
        String substring = city.substring(city.indexOf("\u7701") + 1, city.indexOf("\u5E02") + 1);
        String c = city.substring(city.indexOf("\u5E02") + 1);
        boolean s = city.contains("\u5E02");
        System.out.println(substring);
        System.out.println(c);
        System.out.println(s);
    }
}
