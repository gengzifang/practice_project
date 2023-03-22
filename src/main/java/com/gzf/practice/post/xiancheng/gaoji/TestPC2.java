// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPC2.java

package com.gzf.practice.post.xiancheng.gaoji;


// Referenced classes of package com.gzf.practice.post.xiancheng.gaoji:
//            TV, Player, Watcher

public class TestPC2
{

    public TestPC2()
    {
    }

    public static void main(String args[])
    {
        TV tv = new TV();
        (new Player(tv)).start();
        (new Watcher(tv)).start();
    }
}
