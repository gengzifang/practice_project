// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPC.java

package com.gzf.practice.post.xiancheng.gaoji;

import java.io.PrintStream;

// Referenced classes of package com.gzf.practice.post.xiancheng.gaoji:
//            Chicken

class SynContainer
{

    SynContainer()
    {
        lock = new Object();
        chickens = new Chicken[10];
        count = 0;
    }

    public synchronized void push(Chicken chicken)
    {
        if(count == chickens.length)
            try
            {
                System.out.println("\u751F\u4EA7\u8005 wait ========");
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        chickens[count] = chicken;
        count++;
        notifyAll();
    }

    public synchronized Chicken pop()
    {
        if(count == 0)
            try
            {
                System.out.println("\u6D88\u8D39\u8005 wait ========");
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        count--;
        Chicken chicken = chickens[count];
        notifyAll();
        return chicken;
    }

    private Object lock;
    Chicken chickens[];
    int count;
}
