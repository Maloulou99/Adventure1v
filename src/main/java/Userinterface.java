public class Userinterface {
    private Extra extra = new Extra();
    private Adventure adventure;


    public Userinterface(Adventure adventure) {
        this.adventure = adventure;
    }

    public void startProgram() {
        System.out.println("Choice a player name");
        adventure.getPlayer().setName(extra.getScanString());
        System.out.println("""
                Hi, Welcome to the adventure game let's play! You will start in room 1, try to go one direction:
                Tap - 'Go North' or "n"
                Tap - 'Go East' or "e"
                Tap - 'Go South' or "s"
                Tap - 'Go West' or "w"
                Tap - 'Look' or "l"
                Tap - 'Help' or "h"
                Tap - 'End Game' or "End""");


        //input = ui.getScanString(); //String som giver errormessage, hvis bruger skriver en anden karakter
        command();
    }

    private void command() {

        System.out.println(extra.BLACK_BOLD_BRIGHT + "Select an option: ");

        boolean player = true;
        while (player) {
            String input = extra.getScanString();
            switch (input) {
                case "Go north", "n":
                    boolean isNorth = adventure.goNorth();
                    if (isNorth) {
                        System.out.println("Going north");
                        System.out.println(adventure.getPlayer().getCurrentRoom());
                    } else {
                        System.out.println("You cannot go north");
                    }
                    break;
                case "Go east", "e":
                    boolean isEast = adventure.goEast();
                    if (isEast){
                        System.out.println("Going East");
                        System.out.println(adventure.getPlayer().getCurrentRoom());
                    } else {
                        System.out.println("You cannot go east");
                    }
                    break;
                case "Go south", "s":
                    boolean isSouth = adventure.goSouth();
                    if (isSouth) {
                        System.out.println("Going south");
                        System.out.println(adventure.getPlayer().getCurrentRoom());
                    } else {
                        System.out.println("You cannot go south");
                    }
                    break;
                case "Go west", "w":
                   boolean isWest = adventure.goWest();
                    if (isWest) {
                        System.out.println("Going west");
                        System.out.println(adventure.getPlayer().getCurrentRoom());
                    } else {
                        System.out.println("You cannot go west");
                    }
                    break;
                case "Look", "l":
                    System.out.println(adventure.getPlayer().look());
                    adventure.getPlayer().look();
                    System.out.println("Looking");
                    break;
                case "Help", "h":
                    System.out.println(("""
                            You have some choice here:
                            Tap - 'Go North' or "n" to go north
                            Tap - 'Go East' or "e" to go east
                            Tap - 'Go South' or "s" to go south
                            Tap - 'Go West' or "w" to go west
                            Tap - 'Look' or "l" to looking
                            Tap - 'End Game' or "End to end the game"""));
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

    /*public void run() {

        System.out.println("Welcome to the Adventure Game");
        while (true) {
            String input = ui.getScanString();
            if (input.equalsIgnoreCase("Go north")) {
                if (adventure.goNorth() == true) {
                    System.out.println("You can go north");
                    System.out.println(adventure.getCurrentRoom());
                } else {
                    System.out.println("You cannot go north");
                }

            } else if (input.equalsIgnoreCase("Go south")) {
                if (adventure.goSouth() == true) {
                    System.out.println("You can go south");
                    System.out.println(adventure.getCurrentRoom());
                } else {
                    System.out.println("You cannot go south");
                }

            } else if (input.equalsIgnoreCase("Go east")) {
                if (adventure.goEast() == true) {
                    System.out.println("Going east");
                    System.out.println(adventure.getCurrentRoom());
                } else {
                    System.out.println("You cannot go east");
                }

            } else if (input.equalsIgnoreCase("Go west")) {
                if (adventure.goWest() == true) {
                    System.out.println("Going west");
                    System.out.println(adventure.getCurrentRoom());
                } else {
                    System.out.println("You cannot go west");
                }

            } else if (input.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting Thanks for playing");
                System.exit(0);

            } else if (input.equalsIgnoreCase("Help")) {
                System.out.println("Helping");

            } else if (input.equalsIgnoreCase("Look")) {
                System.out.println("Looking");

                System.out.println(room.getRoomName());
                System.out.println(room.getRoomDescription());

            } else {
                System.out.println("You cannot write that");
            }
        }
    }*/
}



