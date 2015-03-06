package kr.pe.lahuman.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lahuman on 2015-03-06.
 */
public class DrawingClient extends JFrame {
    private static final long serivalVersionUID = 1L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeFactory.ShapeType shapes[] = {ShapeFactory.ShapeType.LINE, ShapeFactory.ShapeType.OVAL_FILL, ShapeFactory.ShapeType.OVAL_NOFILL};
    private static final Color colors[] = {Color.RED, Color.GREEN, Color.YELLOW};

    public DrawingClient(int width, int height){
        this.WIDTH = width;
        this.HEIGHT = height;
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomColor());
                }
            }
        });

    }

    private int getRandomHeight() {
        return (int) (Math.random()*(HEIGHT/10));
    }

    private int getRandomX() {
        return (int) (Math.random()*WIDTH);
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int)(Math.random() * shapes.length)];
    }

    public int getRandomWidth() {
        return (int) (Math.random()*(WIDTH/10));
    }

    public Color getRandomColor() {
        return colors[(int) (Math.random()* colors.length)];
    }

    public int getRandomY() {
        return (int) (Math.random()*HEIGHT);
    }

    public static void main(String[] args){
        DrawingClient drawing = new DrawingClient(500, 600);
    }
}
