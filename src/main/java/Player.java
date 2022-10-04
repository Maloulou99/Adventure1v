import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private String name;
    private ArrayList<Item> inventory;


    public Player (Room currentRoom){
        this.inventory = new ArrayList<>();
        this.currentRoom = currentRoom;
        this.name = "";
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
        if (currentRoom.getItem().isEmpty())
            return currentRoom.getRoomDescription();
        else
            return currentRoom.getItem() + currentRoom.getRoomDescription();

    }

    public Item searchItem(String name){
        for (Item item : this.inventory){
            if(item.getItemName().equalsIgnoreCase(name));
            return item;
        } return null;
    }

    public boolean takeItem(String itemName) {
        Item take = currentRoom.takeItem();
        if(take != null){
            currentRoom.removeItem(take);
            inventory.add(take);
            //addItem(take);
            return true;
        }else{
            return false;
        }

    }

    public boolean dropItem(String itemName) {
        Item item = searchItem(itemName);
        if (item == null) {
            return false;
        } else {
            inventory.remove(item);
            currentRoom.getItem().add(item);
            return true;
        }
    }


    public Room getCurrentRoom(){
        return currentRoom;
    }
    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }

    //Rummene som bruger kan passere
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

    public String getRoomName(){
        return currentRoom.getRoomName();
    }

}
