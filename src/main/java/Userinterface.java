public class Userinterface {
    private Map map;
    private UI ui = new UI();
    private Adventure adventure;
    String input;

    public Userinterface(Adventure adventure) {
        this.adventure = adventure;
    }

    public void startProgram() {
        System.out.println("""
                Hi, Welcome to the adventure game let's play!
                Tap - 'Go North'
                Tap - 'Go East'
                Tap - 'Go South'
                Tap - 'Go West'
                Tap - 'Look'
                Tap - 'End Game'""");


        //input = ui.getScanString(); //String som giver errormessage, hvis bruger skriver en anden karakter
        command(input);
    }

    private void command(String input) {
        System.out.println(ui.BLACK_BOLD_BRIGHT + "Select an option: ");
        boolean player = true;
        while (player) {
            input = ui.getScanString();
            switch (input) {
                case "North":
                    boolean isNorth = map.goNorth();
                    if (isNorth) {
                        System.out.println("Going north");
                        System.out.println(map.getCurrentRoom());
                    } else {
                        System.out.println("You cannot go north");
                    }
                    break;
                case "East":
                    boolean isEast = map.goEast();
                    if (isEast){
                        System.out.println("Going East");
                        System.out.println(map.getCurrentRoom());
                    } else {
                        System.out.println("You cannot go east");
                    }
                    break;
                case "South":
                    boolean isSouth = map.goSouth();
                    if (isSouth) {
                        System.out.println("Going south");
                        System.out.println(map.getCurrentRoom());
                    } else {
                        System.out.println("You cannot go south");
                    }
                    break;
                case "West":
                   boolean isWest = map.goWest();
                    if (isWest) {
                        System.out.println("Going west");
                        System.out.println(map.getCurrentRoom());
                    } else {
                        System.out.println("You cannot go west");
                    }
                    break;
                case "Look":
                    System.out.println(map.look());
                    map.look();
                    System.out.println("Looking");
                    break;
                case "End game":
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



