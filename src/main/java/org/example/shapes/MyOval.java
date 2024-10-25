package org.example.shapes;

import org.example.Panel;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyOval implements Drawable{
    public MyOval(){
        Panel.addDrawable(this);
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.PINK);
        g2d.fill(new Ellipse2D.Double(300, 290, 50, 70));
    }
}
