import java.util.ArrayList;

public class Enemy {

    private int health;
    private Weapon weapon;
    private String enemyName;
    private String enemyDescription;
    private Weapon enemyHealth;
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

    //TODO metoder som skal bruges ifht. kriterier....
    public boolean enemyAlive(Room room) {
        return room.getEnemy().health > 0;
    }
    public int enemyAttack() {
        return enemyCurrentWeapon.getDamage();
    }
    public void dropEnemyWeapon(Room currentRoom) {
        currentRoom.addEnemyItem(enemyCurrentWeapon);
    }



    public String toString() {
        return "\nFound enemy: " + enemyName + ", " + enemyDescription + "\nHealth: " + enemyHealth + "\nWeapon: " + enemyCurrentWeapon;
    }
}
