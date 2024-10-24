package org.example.Shapes;

import org.example.Panel;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyOval implements Drawable{
    public MyOval(){
        Panel.addDrawable(this);
    }

    public void draw(Graphics2D g2d) {
//        final DrawInstructions drawInstructions = new DrawInstructions();
//        drawInstructions.setColor(Color.PINK);
//        drawInstructions.setShape(new Ellipse2D.Double(300, 290, 50, 70));

//        Panel.addDrawable(this);
        g2d.setColor(Color.PINK);
        g2d.fill(new Ellipse2D.Double(300, 290, 50, 70));
    }
}
