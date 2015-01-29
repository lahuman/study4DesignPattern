package kr.pe.lahuman.abstractfactory;

import kr.pe.lahuman.factory.Computer;
import kr.pe.lahuman.factory.SERVER;

/**
 * Created by lahuman on 2015. 1. 29..
 */
public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new SERVER(ram,hdd,cpu);
    }
}
