package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getRoomNo(), room);
    }

    public Room getRoom(int roomNumber) {
        return rooms.get(roomNumber);
    }
}