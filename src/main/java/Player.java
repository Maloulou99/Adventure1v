import java.util.ArrayList;

public class Player {


    private Room currentRoom;
    private Weapon currentWeapon;
    private String name;
    private int health;
    private String printHealthDescription;
    private Weapon equipWeapons;
    private ArrayList<Item> inventory;
    private Enemy currentEnemy;



    //Variabler til player
    public Player(Room currentRoom) {
        this.inventory = new ArrayList<>();
        this.currentRoom = currentRoom;
        this.health = 50;
        this.printHealthDescription = printHealthDescription();

    }

    public void setHealth(Item item) {
        if (item instanceof Food) {
            this.health += ((Food) item).getHealthPoints();
        }
        if (health > 50) {
            health = 50;
        }
    }

    public int getEnemyDmg() {
        return currentEnemy.enemyDmg();
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
        return currentRoom.toString();
    }

    public boolean takeItem(String itemName) {
        for (Item item : currentRoom.getItems()) {
            if (item.getItemName().toLowerCase().equals(itemName)) {
                inventory.add(item);
                currentRoom.getItems().remove(item);
                return true;
            }
        }
        return false;
    }

    public boolean dropItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().toLowerCase().equals((itemName))) {
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
        }
        if (health <= 20) {
            printHealthPoints = "Your health is ok, but you are fighting for your life now";
        }
        if (health <= 30) {
            printHealthPoints = "You are in good shape right now";
        }
        if (health <= 40) {
            printHealthPoints = "You are like a newborn baby, no worries right now";
        }
        if (health <= 45) {
            printHealthPoints = "Your health is top notch, there are a few good pull-ups saved";
        }
        return printHealthPoints;
    }

    public WeaponEnum equippedWeapon(String weaponName) {
        Item equipWeapons = searchInventory(weaponName);
        if (equipWeapons == null) {
            return WeaponEnum.NOT_WEAPON;
        } else if (equipWeapons instanceof Weapon) {
            currentWeapon = (Weapon) equipWeapons;
            getCurrentRoom().removeItem(equipWeapons);
            return WeaponEnum.WEAPON;
        } else {
            return WeaponEnum.NOT_FOUND;
        }
    }

    public int getPlayerHealth() {
        return health;
    }

    public void updatePlayerHealth(int healthPoints) {
        health += healthPoints;
    }

    //En metode som benytter rum-metoderne som bruger kan passere og sættes ind i en forloop
    public Room getCurrentRoom() {
        return currentRoom;
    }

    public FoodEnum eatFood(String itemName) {
        Item eatItem = searchInventory(itemName);
        if (eatItem instanceof Food) {
            setHealth(eatItem);
            inventory.remove(eatItem);
            return FoodEnum.FOOD;
        } else if (eatItem == null) {
            return FoodEnum.NOT_FOUND;
        } else {
            return FoodEnum.NOT_FOOD;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEquipWeapons(Weapon equipWeapons) {
        this.equipWeapons = equipWeapons;
    }

    public WeaponEnum equipWeapon() {
        Item equipWeapons = searchInventory(currentWeapon.getItemName());
        if (equipWeapons == null) {
            return WeaponEnum.NOT_FOUND;
        } else if (equipWeapons instanceof Weapon) {
            currentRoom.removeItem(equipWeapons);
            setEquipWeapons((Weapon) equipWeapons);
            return WeaponEnum.WEAPON;

        } else
            return WeaponEnum.NOT_FOUND;
    }


    public Item getCurrentWeapon() {
        return currentWeapon;
    }

    public int enemyAttack() {
        return currentRoom.getEnemy().getEnemyHealth();
    }

    public AttackEnum attackEnemy() {
        Enemy attackEnemy = currentRoom.getEnemies().isEmpty() ? null : currentRoom.getEnemies().get(0);

        if (currentWeapon != null) {
            if (currentWeapon instanceof RangedWeapon) {
                if (currentWeapon.getAmmo() < 1) {
                    return AttackEnum.NO_AMMO;
                }
                if (attackEnemy != null) {
                    attackEnemy.updateEnemyHealth(currentWeapon.getDamage());
                    updatePlayerHealth(enemyAttack());
                    if (attackEnemy.enemyDead()) {
                        currentRoom.enemyRemoves(attackEnemy);
                        attackEnemy.dropEnemyWeapon(currentRoom);
                        return AttackEnum.ENEMY_DEAD;
                    }
                }
                AttackEnum weaponAttackResult = currentWeapon.attack();
                if (weaponAttackResult != null) {
                    return weaponAttackResult;
                }
            } else if (currentWeapon instanceof MeleeWeapon) {
                if (attackEnemy != null) {
                    attackEnemy.updateEnemyHealth(currentWeapon.getDamage());
                    updatePlayerHealth(enemyAttack());
                    if (attackEnemy.enemyDead()) {
                        currentRoom.enemyRemoves(attackEnemy);
                        attackEnemy.dropEnemyWeapon(currentRoom);
                        return AttackEnum.ENEMY_DEAD;
                    }
                }
            }
        } else {
            return AttackEnum.NO_WEAPON_EQUIPPED;
        }

        return AttackEnum.NO_WEAPON_EQUIPPED; // Fallback hvis ingen tidligere tilfeller passet
    }


    public int getAmmo() {
        return currentWeapon.getAmmo();
    }

    public int getEnemyHealth() {
        return currentEnemy.getEnemyHealth();
    }

    public boolean move(char direction) {
        Room requestRoom = null;
        boolean success = false;

        if (direction == 'n') {
            requestRoom = currentRoom.getRoomNorth();
            success = goNorth();
        } else if (direction == 's') {
            requestRoom = currentRoom.getRoomSouth();
            success = goSouth();
        } else if (direction == 'e') {
            requestRoom = currentRoom.getRoomEast();
            success = goEast();
        } else if (direction == 'w') {
            requestRoom = currentRoom.getRoomWest();
            success = goWest();
        }

        if (success && requestRoom != null) {
            currentRoom = requestRoom;
            return true;
        } else {
            return false;
        }
    }


    // Metoder til bruger kan bevæge sig i rummene
    public boolean goNorth() {
        Room northRoom = currentRoom.getRoomNorth();
        if (northRoom == null) {
            return false;
        } else {
            if (northRoom.isVisited()) {
                System.out.println(northRoom.getRoomDescription());
                markRoomAsVisited(northRoom.getRoomNorth()); // Marker rummet som besøgt
            }
                currentRoom = northRoom;
                return true;
        }
    }

    public boolean goSouth() {
        Room southRoom = currentRoom.getRoomSouth();
        if (southRoom == null) {
            return false;
        } else {
            if (southRoom.isVisited()) {
                System.out.println(southRoom.getRoomDescription());
                markRoomAsVisited(southRoom.getRoomSouth()); // Marker rummet som besøgt
            }
                currentRoom = southRoom;
                return true;
        }
    }

    public boolean goEast() {
        Room eastRoom = currentRoom.getRoomEast();
        if (eastRoom == null) {
            return false;
        } else {
            if (eastRoom.isVisited()) {
                System.out.println(eastRoom.getRoomDescription());
                markRoomAsVisited(eastRoom.getRoomEast()); // Marker rummet som besøgt
            }
                currentRoom = eastRoom;
            return true;
        }
    }

    public boolean goWest() {
        Room westRoom = currentRoom.getRoomWest();
        if (westRoom == null) {
            return false;
        } else {
            if (westRoom.isVisited()) {
                System.out.println(westRoom.getRoomDescription());
                markRoomAsVisited(westRoom.getRoomWest()); // Marker rummet som besøgt
            }
                currentRoom = westRoom;
            return true;
        }
    }

    private void markRoomAsVisited(Room room) {
        // Marker rummet som besøgt (f.eks. sæt en flagvariabel i rummet til true)
        currentRoom.setVisited(true);
    }



}

