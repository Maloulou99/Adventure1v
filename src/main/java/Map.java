public class Map {
    private Room starterRoom;

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
        room1.addRangedWeapon("gun", " cool handheld gun", 5);

        room2.setRoomWest(room1);
        room2.setRoomEast(room3);
        room2.addItem("lamp", " an old lamp hanging at the wall");
        room2.addFood("banana", " looks ok, let me take it", 10);
        room2.addRangedWeapon("Shotgun", " big and heavy gun", 10);

        room3.setRoomWest(room2);
        room3.setRoomSouth(room6);
        room3.addItem("blanket", " lies curled up on the floor");
        room3.addFood("pizza", " oh, who ordered pizza? It's to delicious", 35 );
        room3.addMeleeWeapon("knife", " that's a dull one");

        room4.setRoomNorth(room1);
        room4.setRoomSouth(room7);
        room4.addItem("sword", " a shiny sword is laying on the ground");
        room4.addFood("chili", " chili there wake you up a slightly ", 12);
        room4.addRangedWeapon("boomerang", " this boomerang have skills", 3);

        room5.setRoomSouth(room8);
        room5.addItem("tv", " can you even watch tv on that tv?");
        room5.addFood("apple", " the apple is poisoned", -34);

        room6.setRoomNorth(room3);
        room6.setRoomSouth(room9);
        room6.addItem("map", " an old map, seems like it could lead to something valuable");
        room6.addFood("Spaghetti", " too much cheese", -23);
        room6.addMeleeWeapon("nippeltwister", " good skill to know");

        room7.setRoomNorth(room4);
        room7.setRoomEast(room8);
        room7.addItem("torch", " a torch hanging at the wall, that could help light up dark places");
        room7.addFood("sandwich", " there is a fly in the food, eww ", -26);

        room8.setRoomWest(room7);
        room8.setRoomEast(room9);
        room8.addItem("shield", " a shield that seems to have a royal crest on it");
        room8.addFood("proteincookie", " seems to have good gains", 45);

        room9.setRoomNorth(room6);
        room9.setRoomWest(room8);
        room9.addRangedWeapon("bananapell", " it's so shiny", 1);

        this.starterRoom = room1;

    }


    public Room getStarterRoom() {
        return starterRoom;
    }


}


