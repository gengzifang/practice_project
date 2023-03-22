// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   reflection04.java

package com.gzf.practice.post.zhuji;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.gzf.practice.post.zhuji:
//            user

public class reflection04
{

    public reflection04()
    {
    }

    public static void test()
    {
        user user = new user();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 0x3b9aca00; i++)
            user.getName();

        long endTime = System.currentTimeMillis();
        System.out.println((new StringBuilder()).append("\u666E\u901A\u65B9\u5F0F\u8C03\u7528\u6267\u884C10\u4EBF\u6B21: ").append(endTime - startTime).append("ms").toString());
    }

    public static void test1()
        throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        user user = new user();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 0x3b9aca00; i++)
            getName.invoke(user, null);

        long endTime = System.currentTimeMillis();
        System.out.println((new StringBuilder()).append("\u53CD\u5C04\u65B9\u5F0F\u8C03\u7528\u6267\u884C10\u4EBF\u6B21: ").append(endTime - startTime).append("ms").toString());
    }

    public static void test2()
        throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        user user = new user();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 0x3b9aca00; i++)
            getName.invoke(user, null);

        long endTime = System.currentTimeMillis();
        System.out.println((new StringBuilder()).append("\u53CD\u5C04\u65B9\u5F0F\u8C03\u7528\u5173\u95ED\u68C0\u6D4B\u6267\u884C10\u4EBF\u6B21: ").append(endTime - startTime).append("ms").toString());
    }

    public static void main(String args[])
        throws InvocationTargetException, NoSuchMethodException, IllegalAccessException
    {
        test();
        test1();
        test2();
    }
}
