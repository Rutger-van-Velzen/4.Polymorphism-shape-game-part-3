package org.example.Shapes;

import org.example.Panel;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MySquare implements Drawable{
    public MySquare(){
        Panel.addDrawable(this);
    }

    public void draw(Graphics2D g2d) {
//        final DrawInstructions drawInstructions = new DrawInstructions();
//        drawInstructions.setColor(Color.RED);
//        drawInstructions.setShape(new Rectangle2D.Double(100, 300, 50, 50));

//        Panel.addDrawable(this);
        g2d.setColor(Color.RED);
        g2d.fill(new Rectangle2D.Double(100, 300, 50, 50));
    }
}
