import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private String name;
    private int health;
    private String eat;
    private ArrayList<Item> inventory;

    //Tilføj objekter til player
    public Player(Room currentRoom) {
        this.inventory = new ArrayList<>();
        this.currentRoom = currentRoom;
        this.health = 100;
    }


    //Inventory metoder
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void addItem(Item i) {
        this.inventory.add(i);
    }

    public Item searchInventoryItems(String name) {
        for (Item i : inventory) {
            if (i.getItemName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public String look() {
        if (currentRoom.getItems().isEmpty())
            return currentRoom.getRoomDescription();
        else
            return currentRoom.getItems() + currentRoom.getRoomDescription();

    }

    public Item searchItem(String itemName) {
        for (Item item : this.inventory) {
            if (item.getItemName().equals(itemName)) ;
            return item;
        }
        return null;
    }

    public boolean takeItem(String itemName) {
        for (Item item : currentRoom.getItems()) {
            if (item.getItemName().equals(itemName)) {
                inventory.add(item);
                currentRoom.getItems().remove(item);
                return true;
            }
        }
        return false;
    }

    public boolean dropItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().equals((itemName))) {
                currentRoom.getItems().add(item);
                inventory.remove(item);
                return true;
            }
        }
        return false;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    //En metode som benytter rum-metoderne som bruger kan passere og sættes ind i en forloop

    public boolean move(char direction) {
        Room requestRoom = null;
        if (direction == 'n') {
            requestRoom = currentRoom.getRoomNorth();
        } else if (direction == 's') {
            requestRoom = currentRoom.getRoomSouth();
        } else if (direction == 'e') {
            requestRoom = currentRoom.getRoomEast();
        } else if (direction == 'w') {
            requestRoom = currentRoom.getRoomWest();
        }

        if (requestRoom != null) {
            currentRoom = requestRoom;
            return true;
        } else {
            return false;
        }
    }


    //Metoder til bruger kan bevæge sig i rummene
    public boolean goNorth() {
        if (currentRoom.getRoomNorth() == null) {
            return false;
        } else {
            currentRoom.getRoomNorth();
            return true;
        }
    }

    public boolean goSouth() {
        if (currentRoom.getRoomSouth() == null) {
            return false;
        } else {
            currentRoom.getRoomSouth();
            return true;
        }
    }

    public boolean goEast() {
        if (currentRoom.getRoomEast() == null) {
            return false;
        } else {
            currentRoom.getRoomEast();
            return true;
        }
    }

    public boolean goWest() {
        if (currentRoom.getRoomWest() == null) {
            return false;
        } else {
            currentRoom.getRoomEast();
            return true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomName() {
        return currentRoom.getRoomName();
    }


    public int getPlayerHealth() {
        return health;
    }

    public String getPlayerEat() {
        return eat;
    }
}
