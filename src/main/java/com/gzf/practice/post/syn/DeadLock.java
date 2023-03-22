// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeadLock.java

package com.gzf.practice.post.syn;


// Referenced classes of package com.gzf.practice.post.syn:
//            Makeup

public class DeadLock
{

    public DeadLock()
    {
    }

    public static void main(String args[])
    {
        Makeup m1 = new Makeup(0, "\u7070\u59D1\u5A18");
        Makeup m2 = new Makeup(1, "\u767D\u96EA\u516C\u4E3B");
        m1.start();
        m2.start();
    }
}
