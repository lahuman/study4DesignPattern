package kr.pe.lahuman.abstractfactory;

import kr.pe.lahuman.factory.Computer;
import kr.pe.lahuman.factory.PC;

/**
 * Created by lahuman on 2015. 1. 29..
 */
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
