package org.example;

import org.example.Shapes.*;

import javax.swing.*;

public class Window {
   public void initWindow(){
       new MySquare();
       new MyCircle();
       new MyRectangle();
       new MyOval();

       Timer timer = new Timer(15, GravityUpdate.getInstance());
       timer.start();

       JFrame frame = new JFrame("Draw Shapes");
       frame.add(Panel.getInstance());
       frame.setSize(400, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
