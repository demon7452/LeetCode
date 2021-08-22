package com.jvm;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceCountingGC {

    public Object instance = null;

    private byte[] bigSize = new byte[2 * 1024 * 1024];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        System.gc();

    }

    @Override
    protected final void finalize() {

    }
}
