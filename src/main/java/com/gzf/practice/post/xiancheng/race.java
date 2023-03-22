// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   race.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

public class race
    implements Runnable
{

    public race()
    {
    }

    public void run()
    {
        int i = 0;
        do
        {
            if(i > 100)
                break;
            if(Thread.currentThread().getName().equals("\u5154\u5B50") && i % 10 == 5)
                try
                {
                    Thread.sleep(5L);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            Boolean flag = Boolean.valueOf(gameOver(i));
            if(flag.booleanValue())
                break;
            System.out.println((new StringBuilder()).append(Thread.currentThread().getName()).append("-->\u8DD1\u4E86").append(i).append("\u6B65").toString());
            i++;
        } while(true);
    }

    private boolean gameOver(int steps)
    {
        if(winner != null)
            return true;
        if(steps >= 100)
        {
            winner = Thread.currentThread().getName();
            System.out.println((new StringBuilder()).append("winner is ").append(winner).toString());
            return true;
        } else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        race race = new race();
        (new Thread(race, "\u5154\u5B50")).start();
        (new Thread(race, "\u4E4C\u9F9F")).start();
    }

    private static String winner;
}
