package org.example;

import org.example.shapes.*;
import org.example.physics.GravityUpdate;

import javax.swing.*;

public class Window {
   public void initWindow() {
       new MyCircle(100, 100, 25);
       new MyCircle(140, 300, 25);

       Timer timer = new Timer(15, GravityUpdate.getInstance());
       timer.start();

       Timer timer2 = new Timer(15, CollisionUpdate.getInstance());
       timer2.start();

       JFrame frame = new JFrame("Draw Shapes");
       frame.add(Panel.getInstance());
       frame.setSize(400, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
