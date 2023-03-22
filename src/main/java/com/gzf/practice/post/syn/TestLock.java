/*
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestLock.java

package com.gzf.practice.post.syn;


// Referenced classes of package com.gzf.practice.post.syn:
//            TestLock2

public class TestLock {

    public TestLock() {
    }

    public static void main(String args[]) {
        TestLock2 testLock2 = new TestLock2();
        (new Thread(testLock2)).start();
        (new Thread(testLock2)).start();
        (new Thread(testLock2)).start();
    }
}
*/
