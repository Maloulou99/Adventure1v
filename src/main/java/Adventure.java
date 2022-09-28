public class Adventure {

    private Player player;
    private Map map = new Map();

    public Adventure() {
        player = new Player();
        player.setCurrentRoom(map.getStarterRoom());
    }


    //Tilføj rummene med output til bruger
    public boolean goNorth() {
        if (player.getCurrentRoom().getRoomNorth() == null) {
            return false;
        } else {
            player.setCurrentRoom(player.getCurrentRoom().getRoomNorth());
            return true;
        }
    }

    public boolean goSouth() {
        if (player.getCurrentRoom().getRoomSouth() == null) {
            return false;
        } else {
            player.setCurrentRoom(player.getCurrentRoom().getRoomSouth());
            return true;
        }
    }

    public boolean goEast() {
        if (player.getCurrentRoom().getRoomEast() == null) {
            return false;
        } else {
            player.setCurrentRoom(player.getCurrentRoom().getRoomEast());
            return true;
        }
    }

    public boolean goWest() {
        if (player.getCurrentRoom().getRoomWest() == null) {
            return false;
        } else {
            player.setCurrentRoom(player.getCurrentRoom().getRoomWest());
            return true;
        }
    }

    public Player getPlayer() {
        return player;
    }
}
