public class Userinterface {
    private Extra extra = new Extra();
    private Adventure adventure;
    private String userChoice, takeItem, dropItem;
    private boolean isPossible, isPossibleToTakeItem, isPossibleToDropItem;


    public Userinterface(Adventure adventure) {
        this.adventure = adventure;
    }

    public void startProgram() {
        System.out.println("Hi, Welcome to the adventure game let's play!");
        System.out.println("Before we start, choice a player name:");
        adventure.setName(extra.getScanString());
        System.out.println("""
                You will start in room 1, to be able to move, type one of the below:
                Tap - 'Go North' or "n"
                Tap - 'Go East' or "e"
                Tap - 'Go South' or "s"
                Tap - 'Go West' or "w"
                Tap - 'Help' or 'h' to get help in the game
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
                    System.out.println(adventure.getPlayerHealth());
                    break;
                case "eat":
                    System.out.println(adventure.getPlayerEat());
                    break;
                case "help", "h":
                    System.out.println(("""
                            You have some choice here:
                            Tap - 'Go North' or "n" to go north
                            Tap - 'Go East' or "e" to go east
                            Tap - 'Go South' or "s" to go south
                            Tap - 'Go West' or "w" to go west
                            Tap - 'Look' or "l" to looking
                            Tap - 'Inventory' or 'i' to see your backpack
                            Tap - 'Drop' or 'd' to drop your item
                            Tap - 'Take' or 't' to take a item
                            Tap - 'End Game' or "End to end the game"""));
                    break;
                case "End game", "end":
                    player = false;
                    break;
                default:
                    System.out.println("Try again");
                    System.out.println("""
                            Tap - 'Go North'
                            Tap - 'Go East'
                            Tap - 'Go South'
                            Tap - 'Go West'
                            Tap - 'Look'
                            Tap - 'End Game'""");
                    break;

            }
        }
    }
}



