// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPC2.java

package com.gzf.practice.post.xiancheng.gaoji;


// Referenced classes of package com.gzf.practice.post.xiancheng.gaoji:
//            TV

class Player extends Thread
{

    public Player(TV tv)
    {
        this.tv = tv;
    }

    public void run()
    {
        for(int i = 0; i < 20; i++)
            if(i % 2 == 0)
                tv.play("\u5FEB\u4E50\u5927\u672C\u8425\u64AD\u653E\u4E2D");
            else
                tv.play("\u5E7F\u544A\u64AD\u653E\u4E2D");

    }

    TV tv;
}
