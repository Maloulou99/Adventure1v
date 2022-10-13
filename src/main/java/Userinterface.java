import java.util.Scanner;

public class Userinterface {
    private Adventure adventure;
    Scanner scanner = new Scanner(System.in);

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    /*public int getScanInt(String errorMessage) {
        while (!scanner.hasNextInt()) {
            System.out.println(errorMessage);
            scanner.next();
        }
        return readInt();
    }*/

    /*public int readInt(){
        int readInt = scanner.nextInt();
        scanner.nextLine();
        return readInt;
    }
    public int getScanInt() {
        return getScanInt("Value is not allowed, try again ");
    }*/

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

        //input = ui.getScanString(); //String som giver errormessage, hvis bruger skriver en anden karakter
        command();
    }

    private void command() {

        System.out.println(BLACK_BOLD_BRIGHT + "Select an option: ");

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
                case "go":
                    boolean succesGo = adventure.go(userChoice);
                    if (succesGo) {
                        System.out.println("You have gone " + userChoice);
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "take", "t":
                    boolean succesTake = adventure.take(userChoice);
                    if (succesTake) {
                        System.out.println("You have taken " + userChoice);
                    } else {
                        System.out.println("You can't take this item");
                    }
                    break;
                case "look", "l":
                    System.out.println("You have looked... ");
                    System.out.println(adventure.look());
                    break;
                case "inventory", "i":
                    for (Item item : adventure.getInventory()) {
                        System.out.println("> " + item.getItemName());
                    }
                    break;
                case "drop", "d":
                    boolean succesDrop = adventure.dropItem(userChoice);
                    if (succesDrop) {
                        System.out.println("You have doped " + userChoice);
                    } else {
                        System.out.println("Couldn't find at item");
                    }
                    break;
                case "health", "ht":
                    adventure.gethealth();
                    System.out.println(adventure.getPrintHealthDescription());
                    break;
                case "eat":
                    System.out.println(adventure.getInventory());
                    FoodEnum isFood = adventure.getEat(userChoice);
                    switch (isFood)
                    {
                        case FOOD:
                            System.out.println("you had eaten " + isFood + " it has been removed from your inventory");
                            System.out.println("your health is: " + adventure.gethealth());
                            break;
                        case NOT_FOUND:
                            System.out.println(isFood + " it's not in your inventory");
                            break;
                        case NOT_FOOD:
                            System.out.println(isFood + " you can't eat it!");
                            break;
                    }
                    break;
               case "attack", "ack", "fire":
                   AttackEnum attack = adventure.getAttack();
                   switch (attack) {
                       case ATTACKED:
                           System.out.println("you has fired " + adventure.getEquippedWeapon() + "!");
                           if (adventure.getCurrentWeapon() instanceof RangedWeapon)
                               System.out.println("you have so many ammunition back: " + adventure.getAmmo());
                           if (adventure.getCurrentWeapon() instanceof MeleeWeapon) {
                               if (adventure.getPlayer().getCurrentRoom().getEnemies().size() > 0){
                                   System.out.println("the enemy's life is: " + adventure.getEnemyHealth());
                                   System.out.println("the enemy attacked you " + adventure.getPlayer().getCurrentRoom().getEnemies().get(0).enemyDmg() + " oh no!");
                               }else {
                                   System.out.println("The enemy is dead");
                               }
                               System.out.println("your health points is now: " + (adventure.getPlayerHealth()));
                           }
                           break;
                       case ENEMY_DEAD:
                           System.out.println("yes, you did it, the enemy is dead!");
                           break;
                       case NO_WEAPON_EQUIPPED:
                           System.out.println("you don't have a weapon, equip a weapon!");
                           break;
                       case NO_AMMO:
                           System.out.println("you don't have any ammo back, oh no!");
                        }
                        break;
                case "equip", "eq":
                    System.out.println("Your inventory will be showed here:" + adventure.getInventory() );
                    WeaponEnum isWeapon = adventure.getEquipWeapon(getScanString());
                    switch (isWeapon) {
                        case WEAPON:
                            System.out.println("weapon equipped");
                            break;
                        case NOT_WEAPON:
                            System.out.println("it's not a weapon");
                            break;
                        case NOT_FUND:
                            System.out.println("weapon not fund");
                            break;
                        case NO_WEAPON_EQUIPPED:
                            if (adventure.getEquippedWeapon() == null) {
                                System.out.println("you don't have a weapon equipped");
                            }
                            break;
                    }
                    break;
                case "help", "h":
                    System.out.println(("""
                            You have received help-methods here, type a choice!
                            To go north:
                            TAP > 'go north' or "n"
                            To go east:
                            TAP > 'go east' or "e"
                            To go south:
                            TAP > 'go south' or "s"
                            To go west:
                            TAP > 'go west' or "w"
                            Will you see the things in the room?
                            TAP > 'look' or "l" to looking
                            Check your backpack!
                            TAP > 'inventory' or 'i' to see your backpack
                            Drop your item in the roomm if you want:
                            TAP > 'drop' or 'd' to drop your item
                            Take a item in the room:
                            TAP > 'take' or 't' to take a item
                            Are you hungry?
                            TAP > 'eat' to eat something food
                            Check your health-points:
                            TAP > 'health' to see your health
                            Are you sure you want to end the game?
                            TAP > 'end game' or 'eg' to end the game"""));
                    break;
                case "end game", "eg":
                    player = false;
                    break;
                default:
                    System.out.println("Try again");
                    System.out.println("""
                            TAP > 'go north'
                            TAP > 'go east'
                            TAP > 'go south'
                            TAP > 'go west'
                            TAP > 'look'
                            TAP > 'end game'""");
                    break;

            }

        }
    }
}



