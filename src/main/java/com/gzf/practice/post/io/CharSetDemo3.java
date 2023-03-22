// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CharSetDemo3.java

package com.gzf.practice.post.io;

import java.io.FileWriter;
import java.io.IOException;

public class CharSetDemo3
{

    public CharSetDemo3()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        FileWriter fw = new FileWriter("D:\\study\\jichu\\src\\com\\gzf\\a.txt", true);
        fw.write("\u4F60\u771F\u725B\u554A", 0, 3);
        fw.write(25105);
        char chars[] = {
            'a', 'b', 'c', '\u6211'
        };
        fw.write(chars);
        fw.close();
    }
}
