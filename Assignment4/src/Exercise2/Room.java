package Exercise2;

import java.util.EnumMap;
import java.util.Map;

public class Room {
    private Map<Direction, Wall> sides = new EnumMap<>(Direction.class);
    private final int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public void addSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    public int getRoomNo() {
        return roomNo;
    }
}
