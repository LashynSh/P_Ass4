package Exercise3;

public class DoorWall extends Wall {
    private Room room1;
    private Room room2;
    private boolean isOpen;

    public DoorWall(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }
}