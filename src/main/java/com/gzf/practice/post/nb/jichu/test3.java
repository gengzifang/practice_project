// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   test3.java

package com.gzf.practice.post.nb.jichu;;

import java.io.PrintStream;

public class test3
{

    public test3()
    {
    }

    public static void main(String args[])
    {
        String degree = "";
        String s = "31";
        byte byte0 = -1;
        switch(s.hashCode())
        {
        case 1568: 
            if(s.equals("11"))
                byte0 = 0;
            break;

        case 1571: 
            if(s.equals("14"))
                byte0 = 1;
            break;

        case 1599: 
            if(s.equals("21"))
                byte0 = 2;
            break;

        case 1630: 
            if(s.equals("31"))
                byte0 = 3;
            break;

        case 1661: 
            if(s.equals("41"))
                byte0 = 4;
            break;

        case 1664: 
            if(s.equals("44"))
                byte0 = 5;
            break;

        case 1667: 
            if(s.equals("47"))
                byte0 = 6;
            break;

        case 1723: 
            if(s.equals("61"))
                byte0 = 7;
            break;

        case 1754: 
            if(s.equals("71"))
                byte0 = 8;
            break;

        case 1785: 
            if(s.equals("81"))
                byte0 = 9;
            break;

        case 1815: 
            if(s.equals("90"))
                byte0 = 10;
            break;
        }
        switch(byte0)
        {
        case 0: // '\0'
            degree = "\u535A\u58EB";
            break;

        case 1: // '\001'
            degree = "\u7855\u58EB";
            break;

        case 2: // '\002'
            degree = "\u672C\u79D1";
            break;

        case 3: // '\003'
            degree = "\u4E13\u79D1";
            break;

        case 4: // '\004'
            degree = "\u4E13\u79D1";
            break;

        case 5: // '\005'
            degree = "\u9AD8\u4E2D";
            break;

        case 6: // '\006'
            degree = "\u6280\u6821";
            break;

        case 7: // '\007'
            degree = "\u521D\u4E2D";
            break;

        case 8: // '\b'
            degree = "\u521D\u4E2D";
            break;

        case 9: // '\t'
            degree = "\u521D\u4E2D";
            break;

        case 10: // '\n'
            degree = "\u5176\u4ED6";
            break;
        }
        System.out.println(degree);
    }
}
