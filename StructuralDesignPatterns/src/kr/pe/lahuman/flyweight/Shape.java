package kr.pe.lahuman.flyweight;

import java.awt.*;

/**
 * Created by lahuman on 2015-03-06.
 */
public interface Shape {
    public void draw(Graphics g, int x, int y, int width, int height, Color color);
}
