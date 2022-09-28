public class Map {

    private Room currentRoom;
    private Adventure adventure;

    public Map() {

        adventure.room1.setRoomEast(adventure.room2);
        adventure.room1.setRoomSouth(adventure.room4);

        adventure.room2.setRoomWest(adventure.room1);
        adventure.room2.setRoomEast(adventure.room3);

        adventure.room3.setRoomWest(adventure.room2);
        adventure.room3.setRoomSouth(adventure.room6);

        adventure.room4.setRoomNorth(adventure.room1);
        adventure.room4.setRoomSouth(adventure.room7);

        adventure.room5.setRoomSouth(adventure.room8);

        adventure.room6.setRoomNorth(adventure.room3);
        adventure.room6.setRoomSouth(adventure.room9);

        adventure.room7.setRoomNorth(adventure.room4);
        adventure.room7.setRoomEast(adventure.room8);

        adventure.room8.setRoomWest(adventure.room7);
        adventure.room8.setRoomEast(adventure.room9);

        adventure.room9.setRoomNorth(adventure.room6);
        adventure.room9.setRoomWest(adventure.room8);


        this.currentRoom = adventure.room1;

    }

    //Tilføj rummene med output til bruger
    public boolean goNorth() {
        if (currentRoom.getRoomNorth() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getRoomNorth();
            return true;
        }
    }

    public boolean goSouth() {
        if (currentRoom.getRoomSouth() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getRoomSouth();
            return true;
        }
    }

    public boolean goEast() {
        if (currentRoom.getRoomEast() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getRoomEast();
            return true;
        }
    }

    public boolean goWest() {
        if (currentRoom.getRoomWest() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getRoomWest();
            return true;
        }
    }

    public String look() {
        return currentRoom.getRoomName() + currentRoom.getRoomDescription();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

}


