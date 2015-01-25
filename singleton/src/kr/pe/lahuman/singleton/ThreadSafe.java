package kr.pe.lahuman.singleton;

/**
 * Created by lahuman on 2015. 1. 24..
 */
public class ThreadSafe {
    private ThreadSafe(){};
    private static ThreadSafe threadSafe = null;
    public static synchronized ThreadSafe getInstance(){
        if(threadSafe == null){
            threadSafe = new ThreadSafe();
        }
        return threadSafe;
    }
    public static synchronized ThreadSafe getInstanceDoubleLocking(){
        if(threadSafe == null){
            synchronized (ThreadSafe.class){
                threadSafe = new ThreadSafe();
            }
        }
        return threadSafe;
    }

}
