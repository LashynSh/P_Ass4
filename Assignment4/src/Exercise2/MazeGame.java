package Exercise2;

public class MazeGame {
    public static void main(String[] args) {
        MazeBuilder builder = new StandardMazeBuilder();
        Maze maze = builder.addRoom(1)
                .addRoom(2)
                .addDoor(1, 2)
                .addRoom(3)
                .addDoor(2, 3)
                .build();

        System.out.println("The maze was successfully created!");
    }
}
