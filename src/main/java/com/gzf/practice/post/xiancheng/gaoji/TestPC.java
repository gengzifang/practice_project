// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestPC.java

package com.gzf.practice.post.xiancheng.gaoji;


// Referenced classes of package com.gzf.practice.post.xiancheng.gaoji:
//            SynContainer, Productor, Consumer

public class TestPC
{

    public TestPC()
    {
    }

    public static void main(String args[])
    {
        SynContainer synContainer = new SynContainer();
        (new Productor(synContainer)).start();
        (new Consumer(synContainer)).start();
    }
}
