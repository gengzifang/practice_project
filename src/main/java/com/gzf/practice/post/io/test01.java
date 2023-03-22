// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   test01.java

package com.gzf.practice.post.io;

import java.io.*;

public class test01
{

    public test01()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        File vue = new File("D:\\Desktop\\casual\\vuelx");
        File ocr = new File("D:\\Desktop\\casual\\ocr");
        copydir(vue, ocr);
    }

    private static void copydir(File vue, File ocr)
        throws IOException
    {
        File files[] = vue.listFiles();
        File afile[] = files;
        int i = afile.length;
        for(int j = 0; j < i; j++)
        {
            File file = afile[j];
            if(!file.isFile())
                continue;
            FileInputStream fis = new FileInputStream(vue);
            FileOutputStream fos = new FileOutputStream(ocr);
            byte bytes[] = new byte[1024];
            int len;
            while((len = fis.read(bytes)) != -1) 
                fos.write(bytes, 0, len);
            fos.close();
            fis.close();
        }

    }
}
