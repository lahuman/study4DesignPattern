package kr.pe.lahuman.bridge;


/**
 * Created by lahuman on 2015-03-25.
 */
public class Triangle extends  Shape{

    public Triangle(Color c){
        super(c);
    }
    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
