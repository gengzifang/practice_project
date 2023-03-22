// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   reflection.java

package com.gzf.practice.post.zhuji;

import java.io.PrintStream;

// Referenced classes of package com.gzf.practice.post.zhuji:
//            student, person

public class reflection
{

    public reflection()
    {
    }

    public static void main(String args[])
        throws ClassNotFoundException
    {
        person person = new student();
        System.out.println((new StringBuilder()).append("\u8FD9\u4E2A\u4EBA\u662F: ").append(person.name).toString());
        Class c1 = person.getClass();
        Class c2 = Class.forName("com.gzf.practice.post.zhuji.student");
        //Class c3 = com/gzf/zhuji/student;
        Class type = Integer.TYPE;
        System.out.println(type);
        System.out.println((new StringBuilder()).append(c1.hashCode()).append("==").append(c2.hashCode()).append("=="));
    }
}
