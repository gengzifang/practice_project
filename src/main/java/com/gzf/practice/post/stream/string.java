// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   string.java

package com.gzf.practice.post.stream;

import java.io.PrintStream;
import java.util.*;

public class string
{

    public string()
    {
    }

    public static void main(String args[])
    {
        List maps = new ArrayList();
        Map objectObjectHashMap = new HashMap();
        objectObjectHashMap.put("1", "3");
        maps.add(objectObjectHashMap);
        Map map;
        for(Iterator iterator = maps.iterator(); iterator.hasNext(); map.put("1", "2"))
            map = (Map)iterator.next();

        System.out.println(maps);
    }
}
