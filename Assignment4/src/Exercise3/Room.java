package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class Room implements Cloneable {
    private Map<Direction, Wall> sides = new HashMap<>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    // Method for cloning the room
    @Override
    public Room clone() {
        Room clonedRoom = new Room(this.roomNo);
        // Cloning the walls of the room
        for (Direction direction : this.sides.keySet()) {
            Wall wall = this.sides.get(direction);
            clonedRoom.setSide(direction, wall.clone());
        }
        return clonedRoom;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setDoor(Direction direction, DoorWall door) {
        sides.put(direction, door);
    }
}
