// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   nTicket.java

package com.gzf.practice.post.syn;

import java.io.PrintStream;

class BuyTicket
    implements Runnable
{

    BuyTicket()
    {
        ticketNum = 10;
        flag = Boolean.valueOf(true);
    }

    public void run()
    {
        while(flag.booleanValue()) 
            try
            {
                buy();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
    }

    public synchronized void buy()
        throws InterruptedException
    {
        if(ticketNum <= 0)
        {
            flag = Boolean.valueOf(false);
            return;
        } else
        {
            Thread.sleep(100L);
            System.out.println((new StringBuilder()).append(Thread.currentThread().getName()).append("\u62FF\u5230").append(ticketNum--).toString());
            return;
        }
    }

    private int ticketNum;
    Boolean flag;
}
