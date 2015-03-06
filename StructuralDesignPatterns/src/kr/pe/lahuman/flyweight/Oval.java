package kr.pe.lahuman.flyweight;

import java.awt.*;

/**
 * Created by lahuman on 2015-03-06.
 */
public class Oval implements Shape {
    private boolean fill;

    public Oval(boolean f){
        this.fill = f;
        System.out.println("Creating Oval object with fill="+f);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x,y,width,height);
        if(fill){
            circle.fillOval(x,y,width,height);
        }
    }
}
