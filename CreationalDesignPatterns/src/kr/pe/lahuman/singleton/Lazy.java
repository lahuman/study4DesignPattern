package kr.pe.lahuman.singleton;

/**
 * Created by lahuman on 2015. 1. 23..
 */
public class Lazy {
    private Lazy(){}; //private constructor
    private static Lazy lazy; //Lazy object
    public static Lazy getInstance(){
        System.out.println("Call LAZY");
        if(lazy == null){ //when call the getInstance(), create Instance
            lazy = new Lazy();
        }
        return lazy;
    }
}
