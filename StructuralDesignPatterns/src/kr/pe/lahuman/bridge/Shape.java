package kr.pe.lahuman.bridge;

/**
 * Created by lahuman on 2015-03-25.
 */
public abstract class Shape {
    protected Color color;
    public Shape(Color c){
        this.color = c;
    }

    abstract public void applyColor();
}
