// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   entity.java

package com.gzf.practice.post.nb.jichu;;

import java.util.List;

public class entity
{

    public entity()
    {
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public void setEntity1(List entity1)
    {
        this.entity1 = entity1;
    }

    public String getName()
    {
        return name;
    }

    public String getSex()
    {
        return sex;
    }

    public List getEntity1()
    {
        return entity1;
    }

    private String name;
    private String sex;
    private List entity1;
}
