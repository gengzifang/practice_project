// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestYield.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

class MyYield
    implements Runnable
{

    MyYield()
    {
    }

    public void run()
    {
        System.out.println((new StringBuilder()).append(Thread.currentThread().getName()).append("\u7EBF\u7A0B\u5F00\u59CB\u6267\u884C").toString());
        Thread.yield();
        System.out.println((new StringBuilder()).append(Thread.currentThread().getName()).append("\u7EBF\u7A0B\u505C\u6B62\u6267\u884C").toString());
    }
}
