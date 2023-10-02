import java.util.Scanner;

public class Userinterface {
    private Adventure adventure;
    private Scanner scanner = new Scanner(System.in);

    public String getScanString() {
        return scanner.nextLine().toLowerCase();
    }

    public Userinterface(Adventure adventure) {
        this.adventure = adventure;
    }

    public void startProgram() {
        System.out.println("HI, WELCOME TO THE ADVENTUREGAME, LET'S PLAY!");
        System.out.println("BUT BEFORE WE START! Choice a player-name.\n" + "Right here>>>>> ");
        adventure.setName(getScanString());
        System.out.println("""
                You will start in room 1, to be able to move, type one of the below:
                To go north:
                TAP > (go north) or (n)
                To go east:
                TAP > (go east) or (e)
                To go south:
                TAP > (go south) or (s)
                To go west:
                TAP > (go west) or (w)
                If you need help or more information during the game then:
                TAP > (help) or (h) 
                Good luck and enjoy!
                """);

        command();
    }

    private void command() {
        System.out.println("\033[1;90m" + "Select an option: ");

        try {
            boolean player = true;
            while (player) {
                String input = getScanString();
                String[] userInputs = input.split(" ");
                String command = userInputs[0];
                String userChoice = "";
                if (userInputs.length > 1) {
                    userChoice = userInputs[1];
                }
                switch (command) {
                    case "go" -> {
                        char direction = userChoice.charAt(0);
                        boolean successGo = adventure.move(direction);
                        if (successGo){
                            System.out.println("You have gone " + userChoice);
                        } else{
                            System.out.println("You cannot go " + userChoice);
                        }
                    }
                    case "take", "t" -> {
                        boolean succesTake = adventure.take(userChoice);
                        if (succesTake) {
                            System.out.println("You have taken " + userChoice);
                        } else {
                            System.out.println("You can't take this item");
                        }
                    }
                    case "look", "l" -> {
                        System.out.println("You have looked... ");
                        System.out.println(adventure.look());
                    }
                    case "inventory", "i" -> {
                        for (Item item : adventure.getInventory()) {
                            System.out.println("> " + item.getItemName());
                        }
                    }
                    case "drop", "d" -> {
                        boolean succesDrop = adventure.dropItem(userChoice);
                        if (succesDrop) {
                            System.out.println("You have dropped " + userChoice);
                        } else {
                            System.out.println("Couldn't find the item");
                        }
                    }
                    case "health", "ht" -> {
                        adventure.gethealth();
                        System.out.println(adventure.getPrintHealthDescription());
                    }
                    case "eat" -> {
                        System.out.println(adventure.getInventory());
                        FoodEnum isFood = adventure.getEat(userChoice);
                        switch (isFood) {
                            case FOOD -> {
                                System.out.println("You have eaten " + userChoice + " it has been removed from your inventory");
                                System.out.println("Your health is: " + adventure.gethealth());
                            }
                            case NOT_FOUND -> System.out.println(userChoice + " is not in your inventory");
                            case NOT_FOOD -> System.out.println("You can't eat " + userChoice + "!");
                        }
                    }
                    case "attack", "ack", "fire" -> {
                        AttackEnum attack = adventure.getAttack();
                        switch (attack) {
                            case ATTACKED -> {
                                System.out.println("You have fired " + adventure.getEquippedWeapon() + "!");
                                if (adventure.getCurrentWeapon() instanceof RangedWeapon) {
                                    System.out.println("You have so much ammunition left: " + adventure.getAmmo());
                                }
                                if (adventure.getCurrentWeapon() instanceof MeleeWeapon) {
                                    if (!adventure.getPlayer().getCurrentRoom().getEnemies().isEmpty()) {
                                        System.out.println("The enemy's life is: " + adventure.getEnemyHealth());
                                        System.out.println("The enemy attacked you for " + adventure.getEnemyDmg() + " damage!");
                                    } else {
                                        System.out.println("The enemy is dead");
                                    }
                                    System.out.println("Your health points are now: " + adventure.getPlayerHealth());
                                }
                            }
                            case ENEMY_DEAD -> System.out.println("Yes, you did it, the enemy is dead!");
                            case NO_WEAPON_EQUIPPED -> System.out.println("You don't have a weapon, equip a weapon!");
                            case NO_AMMO -> System.out.println("You don't have any ammo left, oh no!");
                        }
                    }
                    case "equip", "eq" -> {
                        System.out.println("Your inventory will be shown here: " + adventure.getInventory());
                        WeaponEnum isWeapon = adventure.equippedWeapon(getScanString());
                        switch (isWeapon) {
                            case WEAPON -> System.out.println("Weapon equipped");
                            case NOT_WEAPON -> System.out.println("It's not a weapon");
                            case NOT_FOUND -> System.out.println("Weapon not found");
                            case NO_WEAPON_EQUIPPED -> {
                                if (adventure.getEquippedWeapon() == null) {
                                    System.out.println("You don't have a weapon equipped");
                                }
                            }
                        }
                    }
                    case "help", "h" -> System.out.println(("""
                            You have received help methods here, type a choice!
                            To go north:
                            TAP > 'go north' or "n"
                            To go east:
                            TAP > 'go east' or "e"
                            To go south:
                            TAP > 'go south' or "s"
                            To go west:
                            TAP > 'go west' or "w"
                            Will you see the things in the room?
                            TAP > 'look' or "l" to look
                            Check your backpack!
                            TAP > 'inventory' or 'i' to see your backpack
                            Drop your item in the room if you want:
                            TAP > 'drop' or 'd' to drop your item
                            Take an item in the room:
                            TAP > 'take' or 't' to take an item
                            Are you hungry?
                            TAP > 'eat' to eat something
                            Check your health points:
                            TAP > 'health' to see your health
                            Are you sure you want to end the game?
                            TAP > 'end game' or 'eg' to end the game"""));
                    case "end game", "eg" -> player = false;
                    default -> {
                        System.out.println("Try again");
                        System.out.println("""
                                TAP > 'go north'
                                TAP > 'go east'
                                TAP > 'go south'
                                TAP > 'go west'
                                TAP > 'look'
                                TAP > 'end game'""");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
