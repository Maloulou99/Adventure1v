public class Room {
    private String roomName;
    private String roomOption;
    private Room roomNorth;
    private Room roomSouth;
    private Room roomEast;
    private Room roomWest;

    //Konstruktør
    public Room(String roomName, String roomOption) {
        this.roomName = roomName;
        this.roomOption = roomOption;
    }

    public void setRooms(Room roomNoth, Room roomSouth, Room roomEast, Room roomWest) {
        this.roomNorth = roomNoth;
        this.roomSouth = roomSouth;
        this.roomEast = roomEast;
        this.roomWest = roomWest;
    }
    public void setRoomOption(){

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

    public String getRoomOption() {
        return roomOption;
    }
    public String getRoomName(){
        return roomName;
    }
}
