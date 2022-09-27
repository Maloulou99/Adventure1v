public class Adventure {

    private Room currentRoom;



   public void mapGame() {
        Room room1 = new Room("Room 1", "room with no distinct features, except two doors");
        Room room2 = new Room("Room 2", "room that has a lot things lying around, only one other door");
        Room room3 = new Room("Room 3", "room with a lot a skeletons and an old axe, and only one other door");
        Room room4 = new Room("Room 4", "room with a giant ready to kill you, fight or run too the door");
        Room room5 = new Room("Room 5", "room with a bag of gold lying on the ground, there are no other doors to go through");
        Room room6 = new Room("Room 6", "room that has a shield hanging at the wall, take it or proceed to the next room");
        Room room7 = new Room("Room 7", "room that has pictures of Kings and Queens, only one door\"");
        Room room8 = new Room("Room 8", "room with two doors, what could they lead too?");
        Room room9 = new Room("Room 9", "room with a minotaurus that are the strongest creature, fight it or flee too the door");



        //TODO kig billede igennem og ret
        room1.setRooms(room2, room4, null, null);
        room2.setRooms(room1, room3, null, null);
        room3.setRooms(room2, room4, null, null);
        room4.setRooms(room1, room7, null, null);
        room5.setRooms(room8, null, null, null);
        room6.setRooms(room3, room9, null, null);
        room7.setRooms(room4, room8, null, null);
        room8.setRooms(room5, room7, room9, null);
        room9.setRooms(room6, room8, null, null);


        //TODO ændre til uden hardcode....
        this.currentRoom = room1;
        /*this.currentRoom = room3;
        this.currentRoom = room4;
        this.currentRoom = room5;
        this.currentRoom = room6;
        this.currentRoom = room7;
        this.currentRoom = room8;
        this.currentRoom = room9;*/
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
            return  true;
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
        return currentRoom.getRoomOption();
    }
public Room getCurrentRoom(){
       return currentRoom;
}

}
