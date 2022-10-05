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



        //TODO skal tilføje kan eat eller ikke
        //TODO skil food og item fra
        room1.setRoomEast(room2);
        room1.setRoomSouth(room4);

        room2.setRoomWest(room1);
        room2.setRoomEast(room3);
        room2.addItem("lamp", " an old lamp hanging at the wall");
        room2.addFood("", " this lamp are to nasty, and not edible", 0);

        room3.setRoomWest(room2);
        room3.setRoomSouth(room6);
        room3.addItem("pizza", " a pizza that seems to have go gains");
        room3.addFood("pizza", " oh, who ordered pizza? It's to delicious", 45 );

        room4.setRoomNorth(room1);
        room4.setRoomSouth(room7);
        room4.addItem("sword", " a shiny sword is laying on the ground");
        room4.addFood("sword", " you are kind of stupid, it's too sharp", 0);

        room5.setRoomSouth(room8);
        room5.addItem("apple", " a big bag of appels");
        room5.addFood("apple", " the apple is poisoned", -34);

        room6.setRoomNorth(room3);
        room6.setRoomSouth(room9);
        room6.addItem("map", " an old map, seems like it could lead to something valuable");
        room6.addFood("map", " you cannot eat the map", 0);

        room7.setRoomNorth(room4);
        room7.setRoomEast(room8);
        room7.addItem("torch", " a torch hanging at the wall, that could help light up dark places");
        room7.addFood("torch", " you will burn, don't eat that", 0);

        room8.setRoomWest(room7);
        room8.setRoomEast(room9);
        room8.addItem("shield", " a shield that seems to have a royal crest on it");
        room8.addFood("shield", " too hard to thicken, cannot eat the item", 0);

        room9.setRoomNorth(room6);
        room9.setRoomWest(room8);

        this.starterRoom = room1;

    }


    public Room getStarterRoom() {
        return starterRoom;
    }


}


