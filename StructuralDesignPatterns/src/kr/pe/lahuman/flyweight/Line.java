package kr.pe.lahuman.flyweight;

import java.awt.*;

/**
 * Created by lahuman on 2015-03-06.
 */
public class Line implements Shape{

    public Line(){
        System.out.println("Creating Line object");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void draw(Graphics line, int x, int y, int width, int height, Color color) {
        line.setColor(color);
        line.drawLine(x,y,width,height);
    }
}
