package kr.pe.lahuman.singleton;

import java.io.Serializable;

/**
 * Created by lahuman on 2015. 1. 26..
 */
public class SerializationSingleton implements Serializable{
    private static final long serialVersionUID = 1L;
    private SerializationSingleton(){};

    private static class SingletonHelper{
        private static final SerializationSingleton INSTANCE = new SerializationSingleton();
    }
    public static SerializationSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }
}
