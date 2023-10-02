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
        return health <= 0;
    }
    public Weapon getWeapon() {
        return weapon;
    }

    public int enemyDmg(){
        return getWeapon().getDamage();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Found enemy: ").append(enemyName).append("\n");
        sb.append("Enemy Description: ").append(enemyDescription).append("\n");
        sb.append("Health: ").append(health).append("\n");
        sb.append("Weapon: ").append(weapon).append("\n");

        return sb.toString();
    }



}
