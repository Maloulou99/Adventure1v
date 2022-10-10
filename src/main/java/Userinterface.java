public class Userinterface {
    private Extra extra = new Extra();
    private Adventure adventure;



    public Userinterface(Adventure adventure) {
        this.adventure = adventure;
    }

    public void startProgram() {
        System.out.println("Hi, Welcome to the adventure game let's play!");
        System.out.println("Before we start, choice a player name:");
        adventure.setName(extra.getScanString());
        System.out.println("""
                You will start in room 1, to be able to move, type one of the below:
                Tap - 'go north' or "n"
                Tap - 'go east' or "e"
                Tap - 'go south' or "s"
                Tap - 'go west' or "w"
                Tap - 'help' or 'h' to get help in the game
                """);

        //input = ui.getScanString(); //String som giver errormessage, hvis bruger skriver en anden karakter
        command();
    }

    private void command() {

        System.out.println(extra.BLACK_BOLD_BRIGHT + "Select an option: ");

        boolean player = true;
        while (player) {
            String input = extra.getScanString();
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
                case "take":
                    boolean succesTake = adventure.take(userChoice);
                    if (succesTake) {
                        System.out.println("You have taken " + userChoice);
                    } else {
                        System.out.println("You can't take this item");
                    }
                    break;
                case "look", "l":
                    System.out.println("Looking ");
                    //System.out.println(adventure.look());
                    System.out.println(adventure.getCurrentRoom().getItems());
                    break;
                case "inventory", "i":
                    //System.out.println(adventure.getInventory());
                    for (Item item : adventure.getInventory()) {
                        System.out.println("* " + item.getItemName());
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
                case "health":
                    System.out.println("Your health is " + adventure.getPrintHealthDescription());
                    break;
                case "eat":
                    System.out.println(adventure.getPlayerEat(userChoice));
                    break;
               case "attack":
                    AttackEnum attack = adventure.getAttack();
                    switch (attack){
                        case MELEE:
                            System.out.println("Melee has been used!");
                            break;
                        case FIRED:
                            System.out.println("You has fired!");
                            break;
                        case NO_AMMO:
                            System.out.println("You don't have any ammo back, oh no!");
                    }
                    break;
                case "equip":
                    System.out.println("Your inventory will be showed here:" + adventure.getInventory() );
                    WeaponEnum isWeapon = adventure.getEquipWeapon(extra.getScanString());
                    switch (isWeapon){
                        case WEAPON:
                            System.out.println("Weapon equipped");
                            break;
                        case NOT_WEAPON:
                            System.out.println("It's not a weapon");
                            break;
                        case NOT_FUND:
                            System.out.println("Weapon not fund");
                    }
                    break;
                case "help", "h":
                    System.out.println(("""
                            You have some choice here:
                            Tap - 'go north' or "n" to go north
                            Tap - 'go east' or "e" to go east
                            Tap - 'go south' or "s" to go south
                            Tap - 'go west' or "w" to go west
                            Tap - 'look' or "l" to looking
                            Tap - 'inventory' or 'i' to see your backpack
                            Tap - 'drop' or 'd' to drop your item
                            Tap - 'take' or 't' to take a item
                            Tap - 'eat' to eat something food
                            Tap - 'health' to see your health
                            Tap - 'end game' to end the game"""));
                    break;
                case "end game":
                    player = false;
                    break;
                default:
                    System.out.println("Try again");
                    System.out.println("""
                            Tap - 'go north'
                            Tap - 'go east'
                            Tap - 'go south'
                            Tap - 'go west'
                            Tap - 'look'
                            Tap - 'end game'""");
                    break;

            }
        }
    }
}



