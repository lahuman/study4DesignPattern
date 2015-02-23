package kr.pe.lahuman.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by lahuman on 2015. 1. 25..
 */
public class Reflection {

    public static void main(String[] args){
        BillPugh instanceOne = BillPugh.getInstance();
        BillPugh instanceTwo = null;

        try {
            Constructor[] constructors = BillPugh.class.getDeclaredConstructors();
            for(Constructor c : constructors){
                //Below code will destroy the singleton pattern
                c.setAccessible(true);
                instanceTwo = (BillPugh)c.newInstance();
                break;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
