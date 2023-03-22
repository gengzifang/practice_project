// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Person.java

package com.gzf.practice.post.stream;


public class Person
{

    public Person()
    {
    }

    public String toString()
    {
        return (new StringBuilder()).append("Person{id='").append(id).append('\'').append(", name='").append(name).append('\'').append(", value='").append(value).append('\'').append('}').toString();
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    private String id;
    private String name;
    private String value;
}
