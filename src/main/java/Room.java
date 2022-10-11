import java.util.ArrayList;

public class Room {

    private String roomName;
    private String roomDescription;
    private Room roomNorth;
    private Room roomSouth;
    private Room roomEast;
    private Room roomWest;
    private ArrayList<Item> items = new ArrayList<>();
    private Item item;
    private Weapon weapon;
    private Enemy enemy;
    private Food food;


    //Konstruktør som definere brugen af de forskellige arrayklasser
    public Room(String roomName, String roomDescription, Item item, Weapon weapon, Enemy enemy, Food food) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.item = item;
        this.weapon = weapon;
        this.enemy = enemy;
        this.food = food;
    }
    public Room(String roomName, String roomDescription, Weapon weapon){
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.weapon = weapon;

    }
    public Room(String roomName, String roomDescription, Item item){
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.item = item;
    }
    public Room(String roomName, String roomDescription, Enemy enemy){
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.enemy = enemy;
    }
    public Room(String roomName, String roomDescription, Item item, Food food){
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.item = item;
        this.food = food;
    }
    public Room(String roomName, String roomDescription, Item item, Enemy enemy){
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.item = item;
        this.enemy = enemy;
    }
    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }

    public String lookItems(){
        return weapon.getItemName() + ",\t" + weapon.getItemDescription() + "\n"
                + item.getItemName() + ",\t" + item.getItemDescription() + "\n";

    }


    //Konstruktør som benyttes til Item, så vi kan lave forskellige metoder til Item
    //Method overloader, kunne det have være hvis jeg benyttede samme objektnavn "addItem"
    public void addItem(Item item) {
        items.add(item);
    }
    //Setter
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


    public String toString() {
        return roomName + " " + roomDescription;
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

}
