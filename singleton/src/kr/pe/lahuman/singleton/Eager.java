package kr.pe.lahuman.singleton;

/**
 * Created by lahuman on 2015. 1. 23..
 */
public class Eager {
    private Eager(){}; //private constructor
    private static Eager eager = new Eager(); //When the call this class, create instance
    public static Eager getInstance(){ //return Eager
        return eager;
    }
}
