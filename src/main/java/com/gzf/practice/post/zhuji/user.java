// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   reflection.java

package com.gzf.practice.post.zhuji;


class user
{

    public user()
    {
    }

    public String toString()
    {
        return (new StringBuilder()).append("user{id=").append(id).append(", name='").append(name).append('\'').append(", age=").append(age).append('}').toString();
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public user(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private int id;
    private String name;
    private int age;
}
