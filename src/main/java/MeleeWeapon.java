public class MeleeWeapon extends Weapon{

    private int ammo;


    public MeleeWeapon(String itemName, String itemDescription, int damage) {
        super(itemName, itemDescription, damage);
    }

    @Override
    public AttackEnum attack() {
        return AttackEnum.MELEE;
    }


    //Override use metode  i weapon


}
