public class Adventure {

    Room currentRoom;
    Room room1;
    Room room2;
    Room room3;
    Room room4;
    Room room5;
    Room room6;
    Room room7;
    Room room8;
    Room room9;

    public Adventure() {
    }


    public void mapGame() {
        room1 = new Room("Room 1", "The first room.");
        room2 = new Room("Room 2", "The second room");
        room3 = new Room("Room 3", "The third room");
        room4 = new Room("Room 4", "The fourth room");
        room5 = new Room("Room 5", "The fifth room");
        room6 = new Room("Room 4", "The sixth room");
        room7 = new Room("Room 4", "The seventh room");
        room8 = new Room("Room 4", "The eighth room");
        room9 = new Room("Room 4", "The ninth room");

        //TODO der skal være fire attributer, men er den sådan??
        room1.setRooms(room2, null, null, null);
        room2.setRooms(room1, room3, null, null);
        room3.setRooms(room2, room4, null, null);
        room4.setRooms(room3, room5, null, null);
        room5.setRooms(room3, room5, null, null);
        room6.setRooms(room5, room7, null, null);
        room7.setRooms(room6, room8, null, null);
        room8.setRooms(room7, room9, null, null);
        room9.setRooms(room8, null, null, null);


        //TODO ændre til uden hardcode....
        /*this.currentRoom = room1;
        this.currentRoom = room3;
        this.currentRoom = room4;
        this.currentRoom = room5;
        this.currentRoom = room6;
        this.currentRoom = room7;
        this.currentRoom = room8;*/
        this.currentRoom = room9;
    }

    //Tilføj rummene med output til bruger
    public void goNorth() {
        if (currentRoom.getRoomNorth() == null) {
            System.out.println("You cannot go north");
        } else {
            currentRoom = currentRoom.getRoomNorth();
        }
    }

    public void goSouth() {
        if (currentRoom.getRoomSouth() == null) {
            System.out.println("You cannot go south");
        } else {
            currentRoom = currentRoom.getRoomSouth();
        }
    }

    public void goEast() {
        if (currentRoom.getRoomEast() == null) {
            System.out.println("You cannot go east");
        } else {
            currentRoom = currentRoom.getRoomEast();
        }
    }

    public void goWest() {
        if (currentRoom.getRoomWest() == null) {
            System.out.println("You cannot go west");
        } else {
            currentRoom = currentRoom.getRoomWest();
        }
    }

    public String look() {
        return currentRoom.getRoomOption();
    }


}
