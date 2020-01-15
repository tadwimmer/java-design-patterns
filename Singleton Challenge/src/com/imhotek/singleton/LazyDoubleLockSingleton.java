package com.imhotek.singleton;

/**
 * Creates a Singleton instance using a thread safe double check to obtain a lock
 * only if the <code>INSTANCE</code> is null when the getInstance method is called.
 * This should only be required on the first call, after than the Singleton INSTANCE
 * will be availaable and prevent created
 */
public class LazyDoubleLockSingleton {

    private volatile static LazyDoubleLockSingleton INSTANCE;

    private LazyDoubleLockSingleton() {
        // Hidden constructor
    }

    public static LazyDoubleLockSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (LazyDoubleLockSingleton.class) {
                if(INSTANCE == null) {
                    INSTANCE = new LazyDoubleLockSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
