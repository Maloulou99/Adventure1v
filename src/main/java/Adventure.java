import java.util.ArrayList;

public class Adventure {

    private Player player;
    private Map map = new Map();

    public Adventure() {

        player = new Player(map.getStarterRoom());
        map.getStarterRoom();
    }

    public void takeItem(String itemName) {
        player.takeItem(itemName);
    }

    public void getItem(String searchItem) {
        player.searchItem(searchItem);
    }

    public void dropItem(String dropItem){
        player.dropItem(dropItem);
    }
    public String look() {
       return player.look();
    }

    public boolean getCurrentRoom() {
        player.getCurrentRoom();
        return getCurrentRoom();
    }

    public ArrayList<Item> getInventory() {
        return player.getInventory();
    }

    public void setName(String setName) {
        player.setName(setName);
    }

    public boolean goNorth(){
        return player.goNorth();
    }
    public boolean goSouth(){
        return player.goSouth();
    }
    public boolean goEast(){
        return player.goEast();
    }
    public boolean goWest(){
        return player.goWest();
    }


    public String getRoomName() {
        return player.getRoomName();
    }
}
