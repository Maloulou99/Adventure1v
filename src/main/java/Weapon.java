public abstract class Weapon extends Item{
    private int ammo;

    public Weapon(String itemName, String itemDescription) {
        super(itemName, itemDescription);
    }

    public abstract AttackEnum attack();
}
