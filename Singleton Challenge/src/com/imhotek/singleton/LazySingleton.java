package com.imhotek.singleton;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    public static LazySingleton getInstance() {

        if(null == INSTANCE) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    private LazySingleton() {
        // Hidden constructor... Can be bypassed with reflection
    }


}
