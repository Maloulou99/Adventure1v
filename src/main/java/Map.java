public class Map {


    private Adventure adventure;
    private Room starterRoom;

    public Map() {
        Room room1 = new Room("Room 1", "room with no distinct features, except two doors");
        Room room2 = new Room("Room 2", "room that has a lot things lying around, only one other door");
        Room room3 = new Room("Room 3", "room with a lot a skeletons and an old axe, and only one other door");
        Room room4 = new Room("Room 4", "room with a giant ready to kill you, fight or run too the door");
        Room room5 = new Room("Room 5", "room with a bag of gold lying on the ground, there are no other doors to go through");
        Room room6 = new Room("Room 6", "room that has a shield hanging at the wall, take it or proceed to the next room");
        Room room7 = new Room("Room 7", "room that has pictures of Kings and Queens, only one door\"");
        Room room8 = new Room("Room 8", "room with two doors, what could they lead too?");
        Room room9 = new Room("Room 9", "room with a minotaurus that are the strongest creature, fight it or flee too the door");

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


