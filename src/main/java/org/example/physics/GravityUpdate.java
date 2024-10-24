package org.example.physics;

import org.example.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GravityUpdate implements ActionListener {
    private static final GravityUpdate GRAVITY_UPDATE = new GravityUpdate();
    private static final List<GravityObject> GRAVITY_OBJECTS = new ArrayList<>();

    private GravityUpdate(){}

    public static GravityUpdate getInstance(){
        return GRAVITY_UPDATE;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateAllGravityObjects();
        Panel.getInstance().repaint();
    }

    private void updateAllGravityObjects(){
        GRAVITY_OBJECTS.forEach(GravityObject::applyGravity);
    }

    public static void addGravityObject(GravityObject gravityObject){
        GRAVITY_OBJECTS.add(gravityObject);
    }
}
