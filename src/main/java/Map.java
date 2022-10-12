import java.util.ArrayList;

public class Map {
    private Room starterRoom;
    public ArrayList<Weapon> weapon = new ArrayList<>();


    public Map() {
        createNewWeapons();
        Room room1 = new Room("Room 1", "room with no distinct features");
        Room room2 = new Room("Room 2", "room that has a lot of blue tiles on walls");
        Room room3 = new Room("Room 3", "room with a lot a skeletons and cobblestone floor");
        Room room4 = new Room("Room 4", "room with a cage");
        Room room5 = new Room("Room 5", "room with a table");
        Room room6 = new Room("Room 6", "room that has a shield hanging on the wall");
        Room room7 = new Room("Room 7", "room that has paintings of Kings and Queens");
        Room room8 = new Room("Room 8", "room with several spiderwebs on the ceiling");
        Room room9 = new Room("Room 9", "room with a chair");

        room1.setRoomEast(room2);
        room1.setRoomSouth(room4);
        room1.addItem(new Item("blanket", "lies curled up on the floor"));
        room1.addItem(new Food("proteincookie", "seems to have good gains", 45));
        room1.addItem(new RangedWeapon("gun", "cool handheld gun", 5, 10));


        room2.setRoomWest(room1);
        room2.setRoomEast(room3);
        room2.addItem(new Item("lamp", "an old lamp hanging at the wall"));
        Enemy monster = new Enemy("monster", "will try too eat you", 10, weapon.get(7));
        room2.addEnemy(monster);
        room2.addItem(new MeleeWeapon("knife", "that's a dull one", 12));

        room3.setRoomWest(room2);
        room3.setRoomSouth(room6);
        room3.addItem(new Item("tv", "can you even watch tv on that tv?"));
        room3.addItem(new Food("sandwich", "there is a fly in the food, eww ", -26));
        room3.addEnemy(new Enemy("robot", "will attack you, do something!", 15, weapon.get(1)));
        room3.addItem(new MeleeWeapon("monsterhands", "hands made be metal", 5));

        room4.setRoomNorth(room1);
        room4.setRoomSouth(room7);
        room4.addItem(new Item("map", "an old map, seems like it could lead to something valuable"));
        room4.addItem(new Food("pasta", "too much cheese", -23));

        room5.setRoomSouth(room8);
        room5.addItem(new Item("torch", "a torch hanging at the wall, that could help light up dark places"));
        Enemy spiderman = new Enemy("spiderman", "red and blue man will come after you", 15, weapon.get(6));
        room5.addEnemy(spiderman);
        room5.addItem(new MeleeWeapon("sword", "a shiny sword is laying on the ground", 23));

        room6.setRoomNorth(room3);
        room6.setRoomSouth(room9);
        room6.addItem(new Item("shield", "a shield that seems to have a royal crest on it"));
        room6.addItem(new Food("apple", "the apple is poisoned", -34));
        room6.addItem(new RangedWeapon("bananapell", "it's so shiny", 1, 10));

        room7.setRoomNorth(room4);
        room7.setRoomEast(room8);
        room7.addItem(new Food("chili", "chili there wake you up a slightly ", 12));
        room7.addItem(new RangedWeapon("shotgun", "big and heavy gun", 10, 10));


        room8.setRoomWest(room7);
        room8.setRoomEast(room9);
        room8.addItem(new Food("pizza", "oh, who ordered pizza? It's to delicious", 35));
        Enemy batman = new Enemy("batman", "try to defend yourself", 7, weapon.get(0));
        room8.addEnemy(batman);
        room8.addItem(new MeleeWeapon("nippeltwister", "cool machine", 7));

        room9.setRoomNorth(room6);
        room9.setRoomWest(room8);
        room9.addItem(new Food("banana", "looks ok, let me take it", 10));
        Enemy boos = new Enemy("boos", "oh, he is strong!", 25, weapon.get(2));
        room9.addEnemy(boos);
        room9.addItem(new RangedWeapon("boomerang", "this boomerang have skills", 3, 6));

        this.starterRoom = room1;


    }

    public Room getStarterRoom() {
        return starterRoom;
    }
    //TODO Tilføje weapon til enemy
    void createNewWeapons() {
        weapon.add(new RangedWeapon("gun", "cool handheld gun", 5, 10));
        weapon.add(new MeleeWeapon("knife", " hat's a dull one", 12));
        weapon.add(new RangedWeapon("shotgun", "big and heavy gun", 10, 5));
        weapon.add(new MeleeWeapon("sword", "a shiny sword is laying on the ground", 7));
        weapon.add(new MeleeWeapon("nippeltwister", "cool machine", 12));
        weapon.add(new RangedWeapon("boomerang", "this boomerang have skills", 3, 12));
        weapon.add(new RangedWeapon("bananapell", "it's so shiny", 1, 10));
        weapon.add(new MeleeWeapon("monsterhands", "hands made be metal", 10));
    }

}



