package kr.pe.lahuman.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lahuman on 2015-02-23.
 */
public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for(Shape sh : shapes){
            sh.draw(fillColor);
        }
    }
    public void add(Shape s){
        shapes.add(s);
    }
    public void remove(Shape s){
        shapes.remove(s);
    }
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
