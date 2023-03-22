// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StaticProxy1.java

package com.gzf.practice.post.xiancheng;


// Referenced classes of package com.gzf.practice.post.xiancheng:
//            zhenShi, daiLi

public class StaticProxy1
{

    public StaticProxy1()
    {
    }

    public static void main(String args[])
    {
        zhenShi zhenShi = new zhenShi();
        daiLi daiLi = new daiLi(zhenShi);
        daiLi.test();
    }
}
