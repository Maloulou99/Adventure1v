import java.util.ArrayList;

public class Map {
    private Room starterRoom;
    private ArrayList<Weapon> weapons = new ArrayList();
    private ArrayList<Item> item = new ArrayList<>();


    public Map() {
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
        room1.setItem(new Item("blanket", " lies curled up on the floor"));
        room1.setItem(new Food("proteincookie", " seems to have good gains", 45));
        Weapon gun = new RangedWeapon("gun", " cool handheld gun", 5);
        room1.addItem(gun);

        room2.setRoomWest(room1);
        room2.setRoomEast(room3);
        room2.setItem(new Item("lamp", " an old lamp hanging at the wall"));
        room2.setEnemies(new Enemy("monster", " will try too eat you", 10,weapons.get(1) ) );
        Weapon knife = new MeleeWeapon("knife", " that's a dull one");
        room2.addItem(knife);

        room3.setRoomWest(room2);
        room3.setRoomSouth(room6);
        room3.setItem(new Item("tv", " can you even watch tv on that tv?"));
        room3.setItem(new Food("sandwich", " there is a fly in the food, eww ", -26));
        room3.setEnemies( new Enemy("robot", " will attack you, do something!", 15, weapons.get(7)));
        Weapon monsterhands = new MeleeWeapon("monsterhands", " hands made be metal");
        room3.addItem(monsterhands);


        room4.setRoomNorth(room1);
        room4.setRoomSouth(room7);
        room4.setItem(new Item("map", " an old map, seems like it could lead to something valuable"));
        room4.setItem(new Food("Spaghetti", " too much cheese", -23));

        room5.setRoomSouth(room8);
        room5.setItem(new Item("torch", " a torch hanging at the wall, that could help light up dark places"));
        room5.setEnemies(new Enemy("spiderman", " red and blue man will come after you", 15, weapons.get(6)));
        Weapon sword = new MeleeWeapon("sword", " a shiny sword is laying on the ground");
        room5.addItem(sword);

        room6.setRoomNorth(room3);
        room6.setRoomSouth(room9);
        room6.setItem(new Item("shield", " a shield that seems to have a royal crest on it"));
        room6.setItem(new Food("apple", " the apple is poisoned", -34));
        room6.setItem(new RangedWeapon("bananapell", " it's so shiny", 1));
        Weapon bananapell = new RangedWeapon("bananapell", " it's so shiny", 1);
        room6.addItem(bananapell);

        room7.setRoomNorth(room4);
        room7.setRoomEast(room8);
        room7.setItem(new Food("chili", " chili there wake you up a slightly ", 12));
        Weapon shotgun = new RangedWeapon("shotgun", " big and heavy gun", 10);
        room7.addItem(shotgun);

        room8.setRoomWest(room7);
        room8.setRoomEast(room9);
        room8.setItem(new Food("pizza", " oh, who ordered pizza? It's to delicious", 35));
        room8.setEnemies(new Enemy("batman", " try to defend yourself", 7, weapons.get(3)));
        Weapon nippeltwister = new MeleeWeapon("nippeltwister", " cool machine");
        room8.addItem(nippeltwister);

        room9.setRoomNorth(room6);
        room9.setRoomWest(room8);
        room9.setItem(new Food("banana", " looks ok, let me take it", 10));
        room9.setEnemies(new Enemy("boos", " oh, he is strong!", 25, weapons.get(2)));
        Weapon boomerang = new RangedWeapon("boomerang", " this boomerang have skills", 3);
        room9.addItem(boomerang);

        this.starterRoom = room1;

    }

    public Room getStarterRoom() {
        return starterRoom;
    }
    public ArrayList<Weapon> setWeapons() {
        weapons.add(new RangedWeapon("gun", " cool handheld gun", 5));
        weapons.add(new MeleeWeapon("knife", " that's a dull one"));
        weapons.add(new RangedWeapon("shotgun", " big and heavy gun", 10));
        weapons.add(new MeleeWeapon("sword", " a shiny sword is laying on the ground"));
        weapons.add(new MeleeWeapon("nippeltwister", " cool machine"));
        weapons.add(new RangedWeapon("boomerang", " this boomerang have skills", 3));
        weapons.add(new RangedWeapon("bananapell", " it's so shiny", 1));
        weapons.add(new MeleeWeapon("monsterhands", " hands made be metal"));
        return null;
    }

}



