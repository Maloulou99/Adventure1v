import java.util.Scanner;


public class Userinterface {
    private Adventure adventure;
    private UI ui = new UI();
    String input;

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

        switch (input) {
            case "North":
                System.out.println("Going north");
            case "East":
                System.out.println("Going east");
            case "south":
                System.out.println("Going south");
            case "west":
                System.out.println("Going west");
            case "Look":
                System.out.println(adventure.look());
            default:
                break;
        }

        public void run(){
        adventure.mapGame();
                Scanner input = new Scanner(System.in);

            System.out.println("Welcome to the Adventure Game");
            while (true) {
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("Go north")) {
                    System.out.println("Going north");
                }
                else if (choice.equalsIgnoreCase("Go south")) {
                    System.out.println("Going south");
                }
                else if (choice.equalsIgnoreCase("Go east")) {
                    System.out.println("Going east");
                }
                else if (choice.equalsIgnoreCase("Go west")) {
                    System.out.println("Going west");
                }
                else if (choice.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting Thanks for playing");
                    System.exit(0);
                }
                else if (choice.equalsIgnoreCase("Help")) {
                    System.out.println("Helping");
                }
                else if (choice.equalsIgnoreCase("Look")) {
                    System.out.println("Looking");
                    System.out.println(currentRoom.getName());
                    System.out.println(currentRoom.getDescription());
                }
                else {
                    System.out.println("You cannot write that");
                }
    }
}


