public class RangedWeapon extends Weapon{

    private int ammo;

    public RangedWeapon(String itemName, String itemDescription, int ammo) {
        super(itemName, itemDescription);
        this.ammo = ammo;
    }


    //Override use metode  i weapon
    public AttackEnum attack() {
        if(ammo>0){
            ammo += -1;
            return AttackEnum.FIRED;
        } else
            return AttackEnum.NO_AMMO;
    }


}
