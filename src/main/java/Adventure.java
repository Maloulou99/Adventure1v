import java.util.ArrayList;

public class Adventure {



    private Player player;
    private Map map = new Map();


    public Adventure() {
        player = new Player(map.getStarterRoom());
    }

    public boolean take(String takeThis) {
        return player.takeItem(takeThis);
    }

    public int gethealth() {
        return player.getPlayerHealth();
    }

    public boolean dropItem(String itemName) {
        return player.dropItem(itemName);
    }

    public String look() {
        return player.look();
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
        return player.attackEnemy();
    }
    public AttackEnum getFired(){
        return player.fired();
    }

    public int getPlayerHealth(){
        return player.getPlayerHealth();
    }
    public String getPrintHealthDescription(){
        return player.printHealthDescription();
    }
    public FoodEnum getEat(String food){
        return player.eatFood(food);
    }
    public WeaponEnum getEquipWeapon(String weaponName){
        return player.equipWeapon(weaponName);
    }
    public WeaponEnum getEquippedWeapon() {
        return player.equipWeapon();
    }

    public Item getCurrentWeapon(){
        return player.getCurrentWeapon();
    }

    public int getAmmo() {
        return player.getAmmo();
    }
}

