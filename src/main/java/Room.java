import java.util.ArrayList;

public class Room {
    private String roomName;
    private String roomDescription;
    private String itemName;
    private String itemDescription;
    private Room roomNorth;
    private Room roomSouth;
    private Room roomEast;
    private Room roomWest;
    private ArrayList<Item> item;


    //Arrayliste til brug til Item Klassen
    //Konstruktør
    public Room(String Name, String description) {
        this.roomName = Name;
        this.roomDescription = description;
        item = new ArrayList<>();
    }
    public Room(){

    }

    //Metoder som bruges i Arraylisten til Item
    public void addItem(String itemName, String itemDescription) {
        Item weapon = new Item(itemName, itemDescription);
        item.add(weapon);
    }
    public Item findItem(String name, Room currentRoom){
        for (Item item : currentRoom.getItem()){
            if(item.getItemName().equalsIgnoreCase(name));
            return item;
        } return null;
    }
    public void noItem(String name){
        System.out.println("Your choice does not exist " + name);
    }
    public void removeItem(Item item, Room currentRoom) {
        currentRoom.getItem().remove(item);
    }
    public void takeItem(String itemName, Room currentRoom){
        Item item = findItem(itemName, currentRoom);
        if(item == null){
        currentRoom.noItem(itemName);
        }else{
           removeItem(item, currentRoom);
        }
    }
    public void seeItem(ArrayList<Item> item) {
        System.out.println(item.toString());
    }

    public void showItems(ArrayList<Item>item) {
        seeItem(item);
    }
    public void printItemsInRoom(int i, Room currentRoom) {
        System.out.println(currentRoom.getItem().get(i).getItemName());
        System.out.println(currentRoom.getItem().get(i).getItemDescription());
    }


    public void setRoomNorth(Room roomNorth) {
        this.roomNorth = roomNorth;
    }

    public void setRoomEast(Room roomEast) {
        this.roomEast = roomEast;
    }

    public void setRoomSouth(Room roomSouth) {
        this.roomSouth = roomSouth;
    }

    public void setRoomWest(Room roomWest) {
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

    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(){
        this.roomName = roomName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }


    public String toString() {
        return roomName + " " + roomDescription;
    }


    public ArrayList<Item> getItem() {
        return item;
    }
}
