package org.example;

import org.example.Shapes.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Panel extends JPanel {
    private static final Panel PANEL = new Panel();
    private static final List<Drawable> DRAWABLES = new ArrayList<>();

    private Panel(){

    }

    public static Panel getInstance(){
        return PANEL;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        DRAWABLES.forEach(drawable -> drawable.draw(g2d));
    }

    public static void addDrawable(Drawable drawable){
        DRAWABLES.add(drawable);
    }
}