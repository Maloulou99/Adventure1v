import java.util.ArrayList;

public class Enemy {

    private int health;
    private Weapon weapon;
    private String enemyName;
    private String enemyDescription;
    private int enemyHealth;
    private Weapon enemyCurrentWeapon;
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
    public AttackEnum attack(){
        return AttackEnum.ENEMY_ATTACKED;
    }

    public void dropEnemyWeapon(Room currentRoom) {
        currentRoom.addEnemyItem(enemyCurrentWeapon);
    }
    public void updateEnemyHealth (int enemyHealthDamage) {
        this.health = health - enemyHealthDamage;
    }
    public boolean enemyDead(){
        return enemyHealth > 0;
    }

    public String toString() {
        return "Found enemy: " + enemyName + ", " + enemyDescription + "\nHealth: " + enemyHealth + "\nWeapon: " + enemyCurrentWeapon;
    }
}
