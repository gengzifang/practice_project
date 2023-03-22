// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StaticProxy.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

// Referenced classes of package com.gzf.practice.post.xiancheng:
//            Marry

class wedding
    implements Marry
{

    public wedding(Marry target)
    {
        this.target = target;
    }

    public void happyMarry()
    {
        before();
        target.happyMarry();
        after();
    }

    private void after()
    {
        System.out.println("\u7ED3\u5A5A\u4E4B\u540E\u6536\u5C3E\u6B3E");
    }

    private void before()
    {
        System.out.println("\u7ED3\u5A5A\u4E4B\u524D\u5E03\u7F6E");
    }

    private Marry target;
}
