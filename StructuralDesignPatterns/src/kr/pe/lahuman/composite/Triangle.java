package kr.pe.lahuman.composite;

/**
 * Created by lahuman on 2015-02-23.
 */
public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+ fillColor);
    }
}
