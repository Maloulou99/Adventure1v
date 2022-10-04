import java.util.ArrayList;

public class Adventure {

    private Player player;
    private Map map = new Map();

    public Adventure() {
        player = new Player(map.getStarterRoom());
        map.getStarterRoom();
    }


    public boolean take(String takeThis) {
        return player.takeItem(takeThis);
    }


    public boolean dropItem(String itemName) {
        return player.dropItem(itemName);
    }

    public String look() {
        return player.look();
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    public ArrayList<Item> getInventory() {
        return player.getInventory();
    }

    public void setName(String setName) {
        player.setName(setName);
    }

    public boolean go(String direction) {
        return player.move(direction.charAt(0));
    }

    public String getRoomName() {
        return player.getRoomName();
    }

    public int getPlayerHealth(){
        return player.getPlayerHealth();
    }
    public String getPlayerEat() {
        return player.getPlayerEat();
    }
}
