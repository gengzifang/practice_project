// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   callable.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;
import java.util.concurrent.*;

public class callable
    implements Callable
{

    public callable()
    {
    }

    public Object call()
        throws Exception
    {
        System.out.println("call\u65B9\u6CD5");
        return Boolean.valueOf(true);
    }

    public static void main(String args[])
        throws ExecutionException, InterruptedException
    {
        callable callable = new callable();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future submit = executorService.submit(callable);
        Object o = submit.get();
        executorService.shutdownNow();
    }
}
