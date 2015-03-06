package kr.pe.lahuman.flyweight;

import java.util.HashMap;

/**
 * Created by lahuman on 2015-03-06.
 */
public class ShapeFactory {
    private static HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type){
        Shape shapeImpl = shapes.get(type);

        if(shapeImpl == null){
            switch(type){
                case OVAL_FILL :
                    shapeImpl = new Oval(true);
                    break;
                case OVAL_NOFILL:
                    shapeImpl = new Oval(false);
                    break;
                case LINE:
                    shapeImpl = new Line();
                    break;
                default:
                    break;
            }
        }
        return shapeImpl;
    }
    public static enum ShapeType{
        OVAL_FILL,OVAL_NOFILL,LINE;
    }
}

