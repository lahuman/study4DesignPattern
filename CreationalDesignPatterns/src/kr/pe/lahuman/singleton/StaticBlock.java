package kr.pe.lahuman.singleton;

/**
 * Created by lahuman on 2015. 1. 23..
 */
public class StaticBlock {
    private StaticBlock(){};
    private static StaticBlock staticBlock = null;
    static{
        try{
            System.out.println("create Static Block");
            staticBlock = new StaticBlock();
        }catch (Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlock getInstance(){
        return staticBlock;
    }
}
