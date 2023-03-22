// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StaticProxy.java

package com.gzf.practice.post.xiancheng;


// Referenced classes of package com.gzf.practice.post.xiancheng:
//            wedding, you

public class StaticProxy
{

    public StaticProxy()
    {
    }

    public static void main(String args[])
    {
        wedding wedding = new wedding(new you());
        wedding.happyMarry();
    }
}
