import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private String name;
    private ArrayList<Item> inventory;


    public Player (Room currentRoom){
        this.inventory = new ArrayList<Item>();
        this.currentRoom = currentRoom;
        this.name = "";
    }

    public void addItem(Item i){
        this.inventory.add(i);
    }


    public String look() {
        return currentRoom.getRoomName() + " " + currentRoom.getRoomDescription() + " " +
                currentRoom.getItemName() + " " + currentRoom.getItemDescription();
    }
    public Item findItem(String name){
        for (Item item : this.inventory){
            if(item.getItemName().equalsIgnoreCase(name));
            return item;
        } return null;
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }
    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Item> getInventory() {
        return inventory;
    }

}
