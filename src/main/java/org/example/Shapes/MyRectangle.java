package org.example.Shapes;

import org.example.Panel;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MyRectangle implements Drawable{
    public MyRectangle(){
        Panel.addDrawable(this);
    }

    public void draw(Graphics2D g2d) {
//        final DrawInstructions drawInstructions = new DrawInstructions();
//        drawInstructions.setColor(Color.GREEN);
//        drawInstructions.setShape(new Rectangle2D.Double(250, 100, 100, 50));

//        Panel.addDrawable(this);
        g2d.setColor(Color.GREEN);
        g2d.fill(new Rectangle2D.Double(250, 100, 100, 50));
    }
}
