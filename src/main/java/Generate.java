import java.util.ArrayList;

public class Generate {
    private ArrayList<Item> items = new ArrayList();
    private ArrayList<Weapon> weapons = new ArrayList();
    private ArrayList<Enemy> enemies = new ArrayList();
    private ArrayList<Food> food = new ArrayList<>();


    public void generateItems() {
        items.add(new Item("lamp", " an old lamp hanging at the wall"));
        items.add(new Item("blanket", " lies curled up on the floor"));
        items.add(new Item("tv", " can you even watch tv on that tv?"));
        items.add(new Item("map", " an old map, seems like it could lead to something valuable"));
        items.add(new Item("torch", " a torch hanging at the wall, that could help light up dark places"));
        items.add(new Item("shield", " a shield that seems to have a royal crest on it"));
    }

    public void generateWeapons() {
        weapons.add(new RangedWeapon("gun", " cool handheld gun", 5));
        weapons.add(new MeleeWeapon("knife", " that's a dull one"));
        weapons.add(new RangedWeapon("shotgun", " big and heavy gun", 10));
        weapons.add(new MeleeWeapon("sword", " a shiny sword is laying on the ground"));
        weapons.add(new MeleeWeapon("nippeltwister", " cool machine"));
        weapons.add(new RangedWeapon("boomerang", " this boomerang have skills", 3));
        weapons.add(new RangedWeapon("bananapell", " it's so shiny", 1));
        weapons.add(new MeleeWeapon("monsterhands", " hands made be metal"));
    }

    public void generateEnemies() {
        enemies.add(new Enemy("monster", " will try too eat you", 10, weapons.get(4)));
        enemies.add(new Enemy("robot", " will attack you, do something!", 15, weapons.get(7)));
        enemies.add(new Enemy("spiderman", " red and blue man will come after you", 15, weapons.get(6)));
        enemies.add(new Enemy("batman", " try to defend yourself", 7, weapons.get(3)));
        enemies.add(new Enemy("boos", " oh, he is strong!", 25, weapons.get(2)));
    }
    public void generateFood(){
        food.add(new Food("banana", " looks ok, let me take it", 10));
        food.add(new Food("pizza", " oh, who ordered pizza? It's to delicious", 35));
        food.add(new Food("chili", " chili there wake you up a slightly ", 12));
        food.add(new Food("apple", " the apple is poisoned", -34));
        food.add(new Food("Spaghetti", " too much cheese", -23));
        food.add(new Food("sandwich", " there is a fly in the food, eww ", -26));
        food.add(new Food("proteincookie", " seems to have good gains", 45));

    }

    public ArrayList<Item> getItems(){
        return items;
    }
    public ArrayList<Weapon> getWeapons(){
        return weapons;
    }

    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }
    public ArrayList<Food> getFood(){
        return food;
    }

}