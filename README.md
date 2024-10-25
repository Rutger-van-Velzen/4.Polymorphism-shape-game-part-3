# 4.Polymorphism-shape-game-part-3

As you may have noticed there are some more classes added to the project.
Those are for a simple collision detection between spheres.

### Assignment: 6
Add `MyCircle` to `CollisionUpdate`'s list of colliders.

### Assignment: 7
Refactor `MyCircle` in a way that it extends the `CircleObject` class.
Keep in mind, the width and height of the circle are its diameter, not the radius!

### Assignment: 8
Make `CircleColliderBehaviour` a member of `MyCircle`. 
Bothe should implement the same interface, this way you can replay a call to this method.
Where should you relay the call to?, To the implemented method in `CircleColliderBehaviour` like so:

```java
private final Collider collider = new CircleColliderBehaviour(this);
// some code

@Override
public boolean collideWith(Collider other) {
    boolean collision = collider.collideWith(other);
    
    // Stop falling...

    return collision;
}
```