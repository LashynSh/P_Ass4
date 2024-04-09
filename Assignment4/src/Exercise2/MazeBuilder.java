package Exercise2;

public class MazeBuilder {
    private Maze maze;

    public MazeBuilder() {
        this.maze = new Maze();
    }

    public MazeBuilder addRoom(Room room) {
        maze.addRoom(room);
        return this;
    }

    public MazeBuilder addDoor(Room room1, Room room2) {
        DoorWall door = new DoorWall(room1, room2);
        room1.setSide(getDirection(room1, room2), door);
        room2.setSide(getDirection(room2, room1), door);
        return this;
    }

    public Maze build() {
        return maze;
    }

    private Direction getDirection(Room from, Room to) {
        if (from.getRoomNo() < to.getRoomNo()) {
            return Direction.EAST;
        } else {
            return Direction.WEST;
        }
    }

}