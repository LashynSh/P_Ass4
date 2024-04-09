package Exercise2;

public class MazeGame {
    public static void main(String[] args) {
        MazeBuilder builder = new MazeBuilder();

        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3);

        builder.addRoom(room1)
                .addRoom(room2)
                .addRoom(room3)
                .addDoor(room1, room2)
                .addDoor(room2, room3);

        Maze maze = builder.build();

        System.out.println("Лабиринт создан успешно!");
    }
}