// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ByteStreamDemo6.java

package com.gzf.practice.post.io;

import java.io.*;

public class ByteStreamDemo6 {

    public ByteStreamDemo6() {
    }

    public static void main(String args[])
            throws IOException {
        FileInputStream fis;
        FileOutputStream fos;
        fis = null;
        fos = null;
        fis = new FileInputStream("D:\\Desktop\\casual\\004bb8d5a55b409a335f3fe8df7edb4a.mp4");
        fos = new FileOutputStream("D:\\Desktop\\casual\\xpg\\renying.mp4");
        byte bytes[] = new byte[0x98400];
        int len;
        while ((len = fis.read(bytes)) != -1)
            fos.write(bytes, 0, len);
        fis.close();
        fos.close();
    }
}
