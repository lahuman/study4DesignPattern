package kr.pe.lahuman.singleton;

import java.io.*;

/**
 * Created by lahuman on 2015. 1. 24..
 */
public class Runner {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        loadSingletonClass();
        callSerialization();
    }

    private static void callSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializationSingleton instanceOne = SerializationSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializationSingleton instanceTwo = (SerializationSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

    }

    private static void loadSingletonClass() {
        System.out.println("begin");
        try {
            Class eager = Class.forName("kr.pe.lahuman.singleton.StaticBlock");
            Class lazy = Class.forName("kr.pe.lahuman.singleton.Lazy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Enum.INSTANCE.doSomething();

        Enum.doSomething();
    }
}
