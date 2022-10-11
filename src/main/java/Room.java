import java.util.ArrayList;

public class Room {

    private String roomName;
    private String roomDescription;
    private Room roomNorth;
    private Room roomSouth;
    private Room roomEast;
    private Room roomWest;
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Enemy> enemies = new ArrayList<>();



    public Room(String roomName, String roomDescription){
    this.roomName = roomName;
    this.roomDescription = roomDescription;

    }
    public Room(String roomName, String roomDescription, Item item) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        items.add(item);
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
        return roomName + " " + roomDescription + " " + items + " " + isEnemy();
    }

    public String isEnemy() {
        if (enemies != null) {
            return enemies.toString();
        }
        return "";
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItem(Item item) {
        this.items.add(item);
    }

    public void setEnemies(Enemy enemies){
        this.enemies.add(enemies);
    }


}
