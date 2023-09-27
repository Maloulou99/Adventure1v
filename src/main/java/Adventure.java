import java.util.ArrayList;

public class Adventure {
    private Player player;
    private Map map = new Map();


    public Adventure() {
        player = new Player(map.getCurrentRoom());
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

    /*public boolean go(String direction) {
        return map.move(direction.charAt(0));
    }*/

    public String getRoomName() {
        return map.getRoomName();
    }

    public String getRoomDescription(){
        return map.getRoomDescription();
    }

    public AttackEnum getAttack() {
        return player.attackEnemy();
    }

    public AttackEnum getFired() {
        return player.fired();
    }

    public int getPlayerHealth() {
        return player.getPlayerHealth();
    }

    public String getPrintHealthDescription() {
        return player.printHealthDescription();
    }

    public FoodEnum getEat(String food) {
        return player.eatFood(food);
    }

    public WeaponEnum equippedWeapon(String equippedWeapon) {
        return player.equippedWeapon(equippedWeapon);
    }

    public WeaponEnum getEquippedWeapon() {
        return player.equipWeapon();
    }

    public Item getCurrentWeapon() {
        return player.getCurrentWeapon();
    }

    public int getAmmo() {
        return player.getAmmo();
    }

    public Map getMap() {
        return map;
    }

    public Player getPlayer() {
        return player;
    }

    public int getEnemyDmg() {
        return player.getEnemyDmg();
    }


    public int getEnemyHealth() {
        return player.getEnemyHealth();
    }


    public boolean goNorth() {
        return player.goNorth();
    }
    public boolean goSouth() {
        return player.goSouth();
    }  public boolean goEast() {
        return player.goEast();
    }  public boolean goWest() {
        return player.goWest();
    }

    public boolean move(char direction){
        return player.move(direction);
    }

    public Room getCurrentRoom() {
        return map.getCurrentRoom();
    }
}

