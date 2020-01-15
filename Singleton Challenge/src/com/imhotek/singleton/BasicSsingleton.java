package com.imhotek.singleton;

/**
 * An eagerly created Basic Singleton.
 */
public class BasicSsingleton {

    /**
     * Eagerly initialized singleton instance. Vulnerable to Reflection, but Thread safe.
     */
    private static final BasicSsingleton BASIC_SINGLETON_INSTANCE = new BasicSsingleton();

    /**
     * REturns the Singleton instance.
     * @return
     */
    public static BasicSsingleton getInstance() {
        return BASIC_SINGLETON_INSTANCE;
    }
    private BasicSsingleton() {
        // Hidden constructor.
    }



}
