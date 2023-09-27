public abstract class Weapon extends Item {
    private int ammo;
    private int damage;

    public Weapon(String itemName, String itemDescription, int damage) {
        super(itemName, itemDescription);
        this.damage = damage;
    }

    public abstract AttackEnum attack();

    public int getAmmo(){
        return ammo;
    }

    public int getDamage() {
        return damage;
    }
}