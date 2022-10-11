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

    public enum ReturnMessage{
        NOT_Found,
        CANT,
        OK
    }

    public boolean dropItem(String itemName) {
        return player.dropItem(itemName);
    }

    public String look() {
        return player.look();
    }
    public String lookItems(){
        return player.lookAround();
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

    public AttackEnum getAttack(){
        return player.attack();
    }

    public int getPlayerHealth(){
        return player.getPlayerHealth();
    }
    public String getPrintHealthDescription(){
        return player.printHealthDescription();
    }

    public boolean getPlayerEat(String food) {
        return player.eat(food);
    }
    public WeaponEnum getEquipWeapon(String weaponName){
        return player.equipWeapon(weaponName);
    }

}

