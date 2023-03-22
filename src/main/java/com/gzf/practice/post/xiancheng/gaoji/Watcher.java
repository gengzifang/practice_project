// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPC2.java

package com.gzf.practice.post.xiancheng.gaoji;


// Referenced classes of package com.gzf.practice.post.xiancheng.gaoji:
//            TV

class Watcher extends Thread
{

    public Watcher(TV tv)
    {
        this.tv = tv;
    }

    public void run()
    {
        for(int i = 0; i < 20; i++)
            tv.watch();

    }

    TV tv;
}
