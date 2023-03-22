// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Demo01.java

package com.gzf.practice.post.nb.switch1;

import java.io.PrintStream;

public class Demo01 {

    public Demo01() {
    }

    public static void main(String args[]) {
        char g = 'B';
        String s = "gengZiFangNb";
        int i = s.hashCode();
        System.out.println(i);
        switch (g) {
            case 65: // 'A'
                System.out.println("\u4F18\u79C0");
                break;

            case 66: // 'B'
                System.out.println("\u826F\u597D");
                break;

            default:
                System.out.println("\u672A\u77E5\u7684\u7B49\u7EA7");
                break;
        }
    }
}
