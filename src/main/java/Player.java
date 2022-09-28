public class Player {

    private Room currentRoom;
    private String name;





    public String look() {
        return currentRoom.getRoomName() + currentRoom.getRoomDescription();
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }
    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}