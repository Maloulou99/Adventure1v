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
    public int getHealth(){
        return health;
    }
    public AttackEnum attack(){
        return AttackEnum.ENEMY_ATTACKED;
    }

    public String toString(){
        return enemyName + " " + enemyDescription + " \n weapon:" + weapon;
    }
}
