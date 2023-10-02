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
    private boolean isVisited;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.roomEast = null;
        this.roomWest = null;
        this.roomNorth = null;
        this.roomSouth = null;
        this.isVisited = false;
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
    public void addEnemyItem(Item enemyItem) {
        items.add(enemyItem);
    }
    public Enemy getEnemy(){
       return enemies.get(0);
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

    public String isEnemy() {
        // Tjek om 'enemies' er ikke-null og ikke tom
        if (enemies != null && !enemies.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Enemy enemy : enemies) {
                sb.append(enemy.toString()).append(", ");
            }
            // Fjern det sidste komma og mellemrum
            int length = sb.length();
            if (length > 2) {
                sb.setLength(length - 2);
            }
            return sb.toString();
        }
        return "";
    }



    public void removeItem(Item item){
        items.remove(item);
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
    public void setVisited(boolean visited) {
        isVisited = visited;
    }
    public boolean isVisited() {
        return !isVisited;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Room Name: ").append(roomName).append("\n");
        stringBuilder.append("Room Description: ").append(roomDescription).append("\n");

        // Håndter items
        if (!items.isEmpty()) {
            stringBuilder.append("Items: \n");
            for (Item item : items) {
                stringBuilder.append(item);
            }
            // Fjern sidste komma og mellemrum
            stringBuilder.setLength(stringBuilder.length() - 2);
            stringBuilder.append("\n");
        } else {
            stringBuilder.append("No items in the room\n");
        }

        // Håndter fjender
        if (isEnemy() != null) {
            stringBuilder.append("An enemy is present in the room\n" + isEnemy());
        } else {
            stringBuilder.append("No enemy in the room\n");
        }

        return stringBuilder.toString();
    }



}
