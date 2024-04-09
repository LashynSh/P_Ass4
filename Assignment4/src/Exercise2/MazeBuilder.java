package Exercise2;

public interface MazeBuilder {
    MazeBuilder addRoom(int roomNo);
    MazeBuilder addDoor(int roomFrom, int roomTo);
    Maze build();
}



public class StandardMazeBuilder implements MazeBuilder {
    private Maze maze;

    public StandardMazeBuilder() {
        this.maze = new Maze();
    }

    @Override
    public StandardMazeBuilder addRoom(int roomNo) {
        Room room = new Room(roomNo);
        maze.addRoom(room);

        // Initialize the room with walls
        for (Direction dir : Direction.values()) {
            room.setSide(dir, new Wall());
        }
        return this;
    }

    @Override
    public StandardMazeBuilder addDoor(int roomFrom, int roomTo) {
        Room r1 = maze.roomNo(roomFrom);
        Room r2 = maze.roomNo(roomTo);
        DoorWall door = new DoorWall(r1, r2);

        r1.setSide(Direction.SOUTH, door); // assuming all doors are to the SOUTH for simplicity
        r2.setSide(Direction.NORTH, door); // and accordingly to the NORTH on the other side
        return this;
    }

    @Override
    public Maze build() {
        return maze;
    }
}
