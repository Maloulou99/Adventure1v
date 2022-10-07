import java.util.ArrayList;

public class Room {

    private String roomName;
    private String roomDescription;
    private Room roomNorth;
    private Room roomSouth;
    private Room roomEast;
    private Room roomWest;
    private ArrayList<Item> items;
    private ArrayList<Food> food;


    //Arrayliste til brug til Item Klassen
    //Konstruktør
    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        items = new ArrayList<>();
    }

    //Konstruktør som benyttes til Item, så vi kan lave forskellige metoder til Item
    //Method overloader, kunne det have være hvis jeg benyttede samme objektnavn "addItem"
    public void addItem(String itemName, String itemDescription) {
        Item itemAdd = new Item(itemName, itemDescription);
        items.add(itemAdd);
    }

    public void addFood(String foodName, String foodDescription, int health) {
        Item foodAdd = new Food(foodName, foodDescription, health);
        items.add(foodAdd);
    }
    public void addRangedWeapon(String weaponName, String nameDescription, int ammo){
        Item rangedWeapon = new RangedWeapon(weaponName, nameDescription, ammo);
        items.add(rangedWeapon);
    }
    public void addMeleeWeapon(String weaponName, String nameDescription){
        Item meleeWeapon = new MeleeWeapon(weaponName, nameDescription);
        items.add(meleeWeapon);
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
