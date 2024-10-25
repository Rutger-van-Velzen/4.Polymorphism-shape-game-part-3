package org.example.gameobject;

import org.example.physics.Collider;
import org.example.shapes.MyCircle;

public class CircleColliderBehaviour implements Collider {
    public final CircleObject self;

    public CircleColliderBehaviour(CircleObject self) {
        this.self = self;
    }

    @Override
    public boolean collideWith(Collider other) {
        if (other == self)
            return false;

        if(other instanceof MyCircle)
            return circleCollideWith((MyCircle)other);

        return false;
    }

    private boolean circleCollideWith(MyCircle other) {
        double dx = self.position.x - other.position.x;
        double dy = self.position.y - other.position.y;
        double distanceSquared = dx * dx + dy * dy;
        double radiusSum = self.radius + other.radius;

        return distanceSquared <= radiusSum * radiusSum;
    }

}
