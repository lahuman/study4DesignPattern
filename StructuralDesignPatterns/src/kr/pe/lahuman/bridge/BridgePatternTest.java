package kr.pe.lahuman.bridge;

/**
 * Created by lahuman on 2015-03-25.
 */
public class BridgePatternTest {
    public static void main(String[] args){
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
