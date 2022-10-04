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

    //Konstruktør som benyttes til Item, så vi kan lave forskellige metoder til Item
    public void addItem(String itemName, String itemDescription) {
        Item itemAdd = new Item(itemName, itemDescription);
        item.add(itemAdd);
    }

    public Item getItem(String name) {
        for (Item item : getItem()) {
            if (item.getItemName().equalsIgnoreCase(name)) ;
        }
        return null;
    }

    public void removeItem(Item item) {
        getItem().remove(item);
    }

    public Item takeItem() {
        if (item != null) {
        } else {
            return null;
        }
        return null;
    }

    public void seeItem(ArrayList<Item> item) {
        System.out.println(item.toString());
    }

    public void showItems(ArrayList<Item> item) {
        seeItem(item);
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

    public void setRoomName() {
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
