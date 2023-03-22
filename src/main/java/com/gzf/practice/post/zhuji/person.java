// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   reflection.java

package com.gzf.practice.post.zhuji;


class person
{

    public String toString()
    {
        return (new StringBuilder()).append("person{name='").append(name).append('\'').append('}').toString();
    }

    public person(String name)
    {
        this.name = name;
    }

    public person()
    {
    }

    String name;
}
