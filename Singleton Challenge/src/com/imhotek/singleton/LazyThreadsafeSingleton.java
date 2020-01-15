package com.imhotek.singleton;

public class LazyThreadsafeSingleton {

    private static LazyThreadsafeSingleton INSTANCE = null;

    private LazyThreadsafeSingleton() {
        // Hidden Constructor
    }

    /**
     * Returns a lazyily initialized Singleton instance that is threadsafe,
     * but the process of obtaining and releasing locks is ineffiecient because synchronization
     * is really only needed the first time the <code>getInstance()</code> method is called.
     * @return
     */
    public static synchronized  LazyThreadsafeSingleton getInstance() {
        if(null == INSTANCE) {
            INSTANCE = new LazyThreadsafeSingleton();
        }
        return INSTANCE;
    }
}
