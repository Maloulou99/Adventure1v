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


    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }

    //Konstruktør som benyttes til Item, så vi kan lave forskellige metoder til Item
    //Method overloader, kunne det have være hvis jeg benyttede samme objektnavn "addItem"
    public void addItem(Item item) {
        items.add(item);
    }

    //Metoder til brug af enemy, add item, tilføje, fjerne enemy....
    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }
    public Weapon addEnemyItem(Item enemyItem) {
        items.add(enemyItem);
        return null;
    }
    public Enemy getEnemy(){
       return enemies.get(0);
    }
    public Enemy findEnemy(){
        for(Enemy findEnemy : enemies) {
            return findEnemy;
        }
        return null;
    }
    public boolean hasEnemy(){
        return !enemies.isEmpty();
    }
    public void enemyRemoves(Enemy enemyName) {
        enemies.remove(enemyName);
    }



    //Setter til retninger af rummene
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
        return roomName + ", " + roomDescription + "\n" + items + "\n" + isEnemy();
    }

    public String isEnemy() {
        if (enemies != null) {
            return enemies.toString();
        }
        return "";
    }
    public boolean enemyAlive() {
        return enemies.get(0).getEnemyHealth() > 0;
    }


    public void removeItem(Item item){
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }






}
