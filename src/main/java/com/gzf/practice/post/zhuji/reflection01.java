// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   reflection01.java

package com.gzf.practice.post.zhuji;

import java.io.PrintStream;

public class reflection01
{

    public reflection01()
    {
    }

    public static void main(String args[])
        throws ClassNotFoundException
    {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        ClassLoader classLoader = Class.forName("com.gzf.practice.post.zhuji.reflection01").getClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);
    }
}
