// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   reflection06.java

package com.gzf.practice.post.zhuji;

import java.lang.annotation.Annotation;

interface file
    extends Annotation
{

    public abstract String columnName();

    public abstract String type();

    public abstract int length();
}
