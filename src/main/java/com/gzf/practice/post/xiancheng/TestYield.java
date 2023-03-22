// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestYield.java

package com.gzf.practice.post.xiancheng;


// Referenced classes of package com.gzf.practice.post.xiancheng:
//            MyYield

public class TestYield
{

    public TestYield()
    {
    }

    public static void main(String args[])
    {
        MyYield myYield = new MyYield();
        (new Thread(myYield, "A")).start();
        (new Thread(myYield, "B")).start();
    }
}
