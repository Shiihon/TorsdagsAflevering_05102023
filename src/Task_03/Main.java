package Task_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();

        Room room01 = new Room(3, 5, 4);
        Room room02 = new Room(2, 4, 8);
        Room room03 = new Room(5, 2, 6);

        rooms.add(room01);
        rooms.add(room02);
        rooms.add(room03);

        Building building = new Building(rooms, 24, 8, false);

        System.out.println(countLampsInBuilding(building)); //calls and prints the method!

        System.out.println(isNormal(building));
    }

    public static int countLampsInBuilding(Building building) {
        int total = 0;

        for (Room rooms : building.getRooms()) {
            int lamps = rooms.getNumberOfLamps();
            total += lamps;
        }
        return total;
    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building!");
            return false;
        }
    }
}
