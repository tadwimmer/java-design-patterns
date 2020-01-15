package com.imhotek.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class BulletProofSingleton implements Serializable {

    private static final long serialVersionUID = 102939495867L;

    private static BulletProofSingleton INSTANCE = new BulletProofSingleton();

    private BulletProofSingleton() {
        // Hidden Constructor.
        if(INSTANCE != null) {
            throw new IllegalStateException("A;ready Created");
        }
    }

    public static BulletProofSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    private Object writeResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton. Can't be cloned.");
    }

    private static Class<BulletProofSingleton> getClass(String className)
            throws ClassNotFoundException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if(loader == null) {
            loader = BulletProofSingleton.class.getClassLoader();
        }
        return (Class<BulletProofSingleton>) loader.loadClass(className);
    }

    public String toString() {
        return "branch 1";
    }

}
