// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StaticProxy1.java

package com.gzf.practice.post.xiancheng;

import java.io.PrintStream;

// Referenced classes of package com.gzf.practice.post.xiancheng:
//            jieKou

class daiLi
    implements jieKou
{

    public daiLi(jieKou jieKou1)
    {
        this.jieKou1 = jieKou1;
    }

    public void test()
    {
        System.out.println("\u4EE3\u7406\u63A5\u53E3\u5B8C\u6210\u7684\u4E8B");
        jieKou1.test();
    }

    private jieKou jieKou1;
}
