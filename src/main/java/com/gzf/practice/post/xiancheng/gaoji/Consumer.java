// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPC.java

package com.gzf.practice.post.xiancheng.gaoji;

import java.io.PrintStream;

// Referenced classes of package com.gzf.practice.post.xiancheng.gaoji:
//            SynContainer, Chicken

class Consumer extends Thread
{

    public Consumer(SynContainer container)
    {
        this.container = container;
    }

    public void run()
    {
        for(int i = 0; i < 100; i++)
            System.out.println((new StringBuilder()).append("\u6D88\u8D39\u4E86-->").append(container.pop().id).append(" \u53EA\u9E21").toString());

    }

    SynContainer container;
}
