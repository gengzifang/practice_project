// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeadLock.java

package com.gzf.practice.post.syn;

import java.io.PrintStream;

// Referenced classes of package com.gzf.practice.post.syn:
//            Lipstick, Mirror

class Makeup extends Thread
{

    public Makeup(int choice, String girlName)
    {
        this.choice = choice;
        this.girlName = girlName;
    }

    public void run()
    {
        try
        {
            makeup();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    private void makeup()
        throws InterruptedException
    {
        if(choice == 0)
        {
            synchronized(lipstick)
            {
                System.out.println((new StringBuilder()).append(girlName).append("\u83B7\u5F97\u4E86\u53E3\u7EA2\u7684\u9501").toString());
                Thread.sleep(1000L);
            }
            synchronized(mirror)
            {
                System.out.println((new StringBuilder()).append(girlName).append("\u83B7\u5F97\u4E86\u955C\u5B50\u7684\u9501").toString());
            }
        } else
        {
            synchronized(mirror)
            {
                System.out.println((new StringBuilder()).append(girlName).append("\u83B7\u5F97\u4E86\u955C\u5B50\u7684\u9501").toString());
                Thread.sleep(2000L);
            }
            synchronized(lipstick)
            {
                System.out.println((new StringBuilder()).append(girlName).append("\u83B7\u5F97\u4E86\u53E3\u7EA2\u7684\u9501").toString());
            }
        }
    }

    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();
    int choice;
    String girlName;

}
