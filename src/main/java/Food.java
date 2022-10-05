public class Food extends Item{

    private int healthPoints;

    public Food(String itemName, String itemDescription, int health) {
        super(itemName, itemDescription);// kald basisklassens konstruktør
        this.healthPoints = health;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

}
