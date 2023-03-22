// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   reflection06.java

package com.gzf.practice.post.zhuji;


class student1
{

    public String toString()
    {
        return (new StringBuilder()).append("student1{id=").append(id).append(", age=").append(age).append(", name='").append(name).append('\'').append('}').toString();
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public student1()
    {
    }

    public student1(int id, int age, String name)
    {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    private int id;
    private int age;
    private String name;
}
