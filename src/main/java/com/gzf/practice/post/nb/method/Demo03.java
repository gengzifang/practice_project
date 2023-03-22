// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo03.java

package com.gzf.practice.post.nb.method;

import java.io.PrintStream;

public class Demo03 {

    public Demo03() {
    }

    public static void main(String args[]) {
        Demo03 demo03 = new Demo03();
        demo03.test(1, new int[]{
                23, 15, 6, 23, 5, 78, 63
        });
    }

    public void test(int n, int i[]) {
        int ai[] = i;
        int j = ai.length;
        for (int k = 0; k < j; k++) {
            int i1 = ai[k];
            System.out.print((new StringBuilder()).append(i1).append(",").toString());
        }

    }
}
