package org.example;

import org.example.physics.Collider;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CollisionUpdate implements ActionListener {
    private static final CollisionUpdate INSTANCE = new CollisionUpdate();
    private static final List<Collider> COLLIDERS = new ArrayList<>();

    private CollisionUpdate(){}

    private void update(){
        COLLIDERS.forEach(self -> COLLIDERS.forEach(other -> other.collideWith(self)));
    }

    public static void addCollider(Collider collider){
        COLLIDERS.add(collider);
    }

    public static CollisionUpdate getInstance() {
        return INSTANCE;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
    }
}
