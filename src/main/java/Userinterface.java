import java.util.Scanner;


public class Userinterface {
    private Adventure adventure;
    private Room room;
    private UI ui = new UI();
    String input;

    public Userinterface(Adventure adventure) {
        this.adventure = adventure;
    }


    public void startProgram() {
        System.out.println("""
                Hi, Welcome to the adventure game let's play!
                Tap - 'North'
                Tap - 'East'
                Tap - 'South'
                Tap - 'West'
                Tap - 'Look'
                9. End Game""");//TODO skal lave en case 'end game'


        input = ui.getScanString(); //String som giver errormessage, hvis bruger skriver en anden karakter
        command(input);
    }

    private void command(String input) {
        System.out.println("Select an option ");
        boolean player = true;
        while (player) {
            input = ui.getScanString();
            switch (input) {
                case "North":

                case "East":


                case "South":
                    System.out.println("Going south");
                case "West":
                    System.out.println("Going west");
                case "Look":
                    System.out.println(adventure.look());
                case "End game":
                    player = false;
                default:
                    System.out.println("Try again");
                    System.out.println("""
                            Hi, Welcome to the adventure game let's play!
                            Tap - 'North'
                            Tap - 'East'
                            Tap - 'South'
                            Tap - 'West'
                            Tap - 'Look'
                            9. End Game""");

            }
        }
    }

    public void run() {

        System.out.println("Welcome to the Adventure Game");
        while (true) {
            String input = ui.getScanString();
            if (input.equalsIgnoreCase("Go north")) {
                if (adventure.goNorth() == true) {
                    System.out.println("You can go north");
                    System.out.println(adventure.getCurrentRoom());
                } else {
                    System.out.println("You can go north");
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
                System.out.println(room.getRoomOption());

            } else {
                System.out.println("You cannot write that");
            }
        }
    }
}



