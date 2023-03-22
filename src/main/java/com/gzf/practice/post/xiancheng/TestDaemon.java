// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestDaemon.java

package com.gzf.practice.post.xiancheng;


// Referenced classes of package com.gzf.practice.post.xiancheng:
//            God, You1

public class TestDaemon
{

    public TestDaemon()
    {
    }

    public static void main(String args[])
    {
        God god = new God();
        You1 you1 = new You1();
        Thread thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();
        (new Thread(you1)).start();
    }
}
