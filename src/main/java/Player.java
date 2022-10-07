import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private Weapon currentWeapon;
    private String name;
    private int health;
    private String printHealthDescription;
    private String eat;
    private Weapon equipWeapons;
    private ArrayList<Item> inventory;

    //Variabler til player
    public Player(Room currentRoom) {
        this.inventory = new ArrayList<>();
        this.currentRoom = currentRoom;
        this.health = 50;
        this.printHealthDescription = printHealthDescription();

    }


    public Item searchInventory(String itemName) {
        for (Item i : inventory) {
            if (i.getItemName().equalsIgnoreCase(itemName)) {
                return i;
            }
        }
        return null;
    }


    //Inventory metode
    public ArrayList<Item> getInventory() {
        return inventory;
    }


    public String look() {
        if (currentRoom.getItems().isEmpty())
            return currentRoom.getRoomDescription();
        else
            return currentRoom.getItems() + currentRoom.getRoomDescription();

    }

    public boolean takeItem(String itemName) {
        for (Item item : currentRoom.getItems()) {
            if (item.getItemName().equals(itemName)) {
                inventory.add(item);
                currentRoom.getItems().remove(item);
                return true;
            }
        }
        return false;
    }

    public boolean dropItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().equals((itemName))) {
                currentRoom.getItems().add(item);
                inventory.remove(item);
                return true;
            }
        }
        return false;
    }

    //Vi giver lige brugeren en update på hvordan spillerens health er
    public String printHealthDescription() {
        String printHealthPoints = "";
        if (health > 0 && health <= 10) {
            printHealthPoints = "Your health is very low, you better do something about it!";
        } else if (health <= 20) {
            printHealthPoints = "Your health is ok, but you are fighting for your life now";
        } else if (health <= 30) {
            printHealthPoints = "You are in good shape right now";
        } else if (health <= 40) {
            printHealthPoints = "You are like a newborn baby, no worries right now";
        } else if (health <= 45) {
            printHealthPoints = "Your health is top notch, there are a few good pull-ups saved";
        }
        return printHealthPoints;
    }

    public WeaponEnum equipWeapon(String weaponName) {
        Item equipWeapons = searchInventory(weaponName);
        if (equipWeapons == null) {
            return WeaponEnum.NOT_WEAPON;
        } else if (equipWeapons instanceof Weapon) {
            currentWeapon = (Weapon) equipWeapons;
            //setEquipWeapons((Weapon) equipWeapons);
            getCurrentRoom().removeItem(equipWeapons);
            return WeaponEnum.WEAPON;
        } else
            return WeaponEnum.NOT_FUND;
    }

    public AttackEnum attack() {
        if (currentWeapon != null) {
            return currentWeapon.attack();
        } else
            return AttackEnum.NO_WEAPON_EQUIPPED;
    }

    public int getPlayerHealth(Food food) {
        return food.getHealthPoints();
    }

    public int getPlayerHealth() {
        return health;
    }

    public int updatePlayerHealth(int healthPoints) {
        health += healthPoints;
        return health;
    }

    public boolean eat(String food) {
        for (Item foodItem : currentRoom.getItems()) {
            if (foodItem.getItemName().equals(food)) {
                if (foodItem instanceof Food) {
                    updatePlayerHealth(getPlayerHealth((Food) foodItem));
                    inventory.remove(foodItem);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    //En metode som benytter rum-metoderne som bruger kan passere og sættes ind i en forloop
    public Room getCurrentRoom() {
        return currentRoom;
    }

    public boolean move(char direction) {
        Room requestRoom = null;
        if (direction == 'n') {
            requestRoom = currentRoom.getRoomNorth();
        } else if (direction == 's') {
            requestRoom = currentRoom.getRoomSouth();
        } else if (direction == 'e') {
            requestRoom = currentRoom.getRoomEast();
        } else if (direction == 'w') {
            requestRoom = currentRoom.getRoomWest();
        }

        if (requestRoom != null) {
            currentRoom = requestRoom;
            return true;
        } else {
            return false;
        }
    }


    //Metoder til bruger kan bevæge sig i rummene
    public boolean goNorth() {
        if (currentRoom.getRoomNorth() == null) {
            return false;
        } else {
            currentRoom.getRoomNorth();
            return true;
        }
    }

    public boolean goSouth() {
        if (currentRoom.getRoomSouth() == null) {
            return false;
        } else {
            currentRoom.getRoomSouth();
            return true;
        }
    }

    public boolean goEast() {
        if (currentRoom.getRoomEast() == null) {
            return false;
        } else {
            currentRoom.getRoomEast();
            return true;
        }
    }

    public boolean goWest() {
        if (currentRoom.getRoomWest() == null) {
            return false;
        } else {
            currentRoom.getRoomEast();
            return true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomName() {
        return currentRoom.getRoomName();
    }

    public void setEquipWeapons(Weapon equipWeapons) {
        this.equipWeapons = equipWeapons;
    }

    public Item getCurrentWeapon() {
        return currentWeapon;
    }

}

