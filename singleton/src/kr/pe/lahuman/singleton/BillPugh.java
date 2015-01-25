package kr.pe.lahuman.singleton;

/**
 * Created by lahuman on 2015. 1. 25..
 */
public class BillPugh {
    private BillPugh(){};
    private static class SingletonHelper{
        private static final BillPugh INSTANCE = new BillPugh();
    }
    public static BillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
