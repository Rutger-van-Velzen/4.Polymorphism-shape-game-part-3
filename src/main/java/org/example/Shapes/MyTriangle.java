package org.example.Shapes;

import org.example.Panel;

import java.awt.*;

public class MyTriangle implements Drawable{
    public MyTriangle(){
        Panel.addDrawable(this);
    }

    public void draw(Graphics2D g2d) {

    }
}
