import java.util.ArrayList;

public class Enemy {

    private int health;
    private Weapon weapon;
    private String enemyName;
    private String enemyDescription;
    private ArrayList<Enemy> enemy = new ArrayList<>();


    public Enemy( String enemyName, String enemyDescription, int health, Weapon weapon) {
        this.health = health;
        this.weapon = weapon;
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
    }


    public ArrayList<Enemy> getEnemy(){
        return enemy;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getEnemyHealth(){
        return health;
    }

    public void dropEnemyWeapon(Room currentRoom) {
        currentRoom.addEnemyItem(weapon);
    }
    public void updateEnemyHealth (int enemyHealthDamage) {
        this.health = health - enemyHealthDamage;
    }
    public boolean enemyDead(){
        return health > 0;
    }

    public String toString() {
        return "Found enemy: " + enemyName + ", " + enemyDescription + "\nHealth: " + health + "\nWeapon: " + weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int enemyDmg(){
        return getWeapon().getDamage();
    }
}
