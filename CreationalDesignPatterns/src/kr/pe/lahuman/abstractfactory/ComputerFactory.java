package kr.pe.lahuman.abstractfactory;

import kr.pe.lahuman.factory.Computer;

/**
 * Created by lahuman on 2015. 1. 29..
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
