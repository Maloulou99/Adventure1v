public class Room {
    private String roomName;
    private String roomDescription;
    private Room roomNorth;
    private Room roomSouth;
    private Room roomEast;
    private Room roomWest;

    //Konstruktør
    public Room(String roomName, String roomOption) {
        this.roomName = roomName;
        this.roomDescription = roomOption;
    }

    public void setRoomNorth(Room roomNorth){
        this.roomNorth = roomNorth;
    }

    public void setRoomEast(Room roomEast) {
        this.roomEast = roomEast;
    }
    public void setRoomSouth(Room roomSouth){
        this.roomSouth = roomSouth;
    }
    public void setRoomWest(Room roomWest){
        this.roomWest = roomWest;
    }

    //getter
    public Room getRoomNorth() {
        return roomNorth;
    }

    public Room getRoomSouth() {
        return roomSouth;
    }

    public Room getRoomEast() {
        return roomEast;
    }

    public Room getRoomWest() {
        return roomWest;
    }

    public String getRoomDescription() {
        return roomDescription;
    }
    public String getRoomName(){
        return roomName;
    }
    public String toString(){
        return roomName + " " + roomDescription;
    }
}
