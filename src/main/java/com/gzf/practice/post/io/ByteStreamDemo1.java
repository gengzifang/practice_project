

package com.gzf.practice.post.io;

import java.io.*;

public class ByteStreamDemo1
{

    public ByteStreamDemo1()
    {
    }

    public static void main(String args[])
        throws IOException
    {
        FileOutputStream fos = new FileOutputStream("D:\\study\\jichu\\src\\com\\gzf\\io\\a.txt");
        FileOutputStream fos1 = new FileOutputStream(new File("D:\\study\\jichu\\src\\com\\gzf\\io\\a.txt"));
        fos.write(65);
        fos.close();
    }
}
