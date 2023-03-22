// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   reflection03.java

package com.gzf.practice.post.zhuji;

import java.io.PrintStream;
import java.lang.reflect.*;

// Referenced classes of package com.gzf.practice.post.zhuji:
//            user

public class reflection03
{

    public reflection03()
    {
    }

    public static void main(String args[])
        throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException
    {
        Class c1 = Class.forName("com.gzf.practice.post.zhuji.user");
        user user = (user)c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", new Class[] {
        });
        setName.invoke(user, new Object[] {
            "\u803F\u5B50\u653E"
        });
        System.out.println(user.getName());
        System.out.println("----------------");
        user user1 = (user)c1.newInstance();
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user1, "\u803F\u5B50\u653E1");
        System.out.println(user1.getName());
    }
}
