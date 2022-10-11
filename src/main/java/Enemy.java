public class Enemy {

    private int health;
    private Weapon weapon;
    private String enemyName;
    private String enemyDescription;



    public Enemy( String enemyName, String enemyDescription, int health, Weapon weapon) {
        this.health = health;
        this.weapon = weapon;
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
    }


}
