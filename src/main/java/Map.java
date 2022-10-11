import java.util.ArrayList;

public class Map {
    private Room starterRoom;
    private Generate generate = new Generate();
    private Room room1;

    public Map() {
        generate.generateWeapons();
        generate.generateEnemies();
        generate.generateItems();
        generate.generateFood();
        room1 = new Room("Room 1", "room with no distinct features", generate.getWeapons().get(1));
        Room room2 = new Room("Room 2", "room that has a lot of blue tiles on walls", generate.getItems().get(2));
        Room room3 = new Room("Room 3", "room with a lot a skeletons and cobblestone floor", generate.getItems().get(3), generate.getFood().get(1));
        Room room4 = new Room("Room 4", "room with a cage", generate.getItems().get(5), generate.getEnemies().get(1));
        Room room5 = new Room("Room 5", "room with a table", generate.getWeapons().get(1));
        Room room6 = new Room("Room 6", "room that has a shield hanging on the wall", generate.getWeapons().get(3), generate.getEnemies().get(3));
        Room room7 = new Room("Room 7", "room that has paintings of Kings and Queens", generate.getFood().get(2), generate.getFood().get(4));
        Room room8 = new Room("Room 8", "room with several spiderwebs on the ceiling", generate.getFood().get(6));
        Room room9 = new Room("Room 9", "room with a chair", generate.getEnemies().get(4));


        room1.setRoomEast(room2);
        room1.setRoomSouth(room4);

        room2.setRoomWest(room1);
        room2.setRoomEast(room3);

        room3.setRoomWest(room2);
        room3.setRoomSouth(room6);

        room4.setRoomNorth(room1);
        room4.setRoomSouth(room7);

        room5.setRoomSouth(room8);

        room6.setRoomNorth(room3);
        room6.setRoomSouth(room9);

        room7.setRoomNorth(room4);
        room7.setRoomEast(room8);

        room8.setRoomWest(room7);
        room8.setRoomEast(room9);

        room9.setRoomNorth(room6);
        room9.setRoomWest(room8);

        this.starterRoom = room1;

    }



    public Room getStarterRoom() {
        return starterRoom;
    }


}

