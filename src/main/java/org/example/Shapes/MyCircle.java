package org.example.Shapes;

import org.example.GravityUpdate;
import org.example.Panel;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyCircle implements Drawable, GravityObject{
    private double y = 100;
    private final Ellipse2D self = new Ellipse2D.Double(100, y, 50, 50);


    public MyCircle(){
        Panel.addDrawable(this);
        GravityUpdate.addGravityObject(this);
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.BLUE);
//        self = new Ellipse2D.Double(100, y, 50, 50);
        g2d.fill(self);
    }

    @Override
    public void applyGravity() {
        y++;
        ((Ellipse2D.Double) self).y = y;

//        System.out.println("y = " + ((Ellipse2D.Double) self).y);
    }
}
