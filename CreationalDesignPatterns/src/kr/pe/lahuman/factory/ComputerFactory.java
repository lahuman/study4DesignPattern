package kr.pe.lahuman.factory;

/**
 * Created by lahuman on 2015. 1. 27..
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equals(type)) return new PC(ram, hdd, cpu);
        else if("SERVER".equals(type)) return new SERVER(ram, hdd, cpu);

        return null;
    }

//    private ComputerFactory(){};
//
//    private static class ComputerFactoryHelper{
//        private static final ComputerFactory INSTANCE= new ComputerFactory();
//    }
//
//    public static ComputerFactory getInstacne(){
//        return ComputerFactoryHelper.INSTANCE;
//    }
}
