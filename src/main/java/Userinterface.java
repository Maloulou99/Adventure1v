import java.util.Scanner;


public class Userinterface {

    public class UserInterface {
        private Adventure adventure;
        private UI ui;
        private Scanner sc = new Scanner(System.in);

        public void startProgram() {
            System.out.println("Hi, Welcome to the adventure game let's play!");
            command();
        }

        private void command(){
            System.out.println("Select an option ");
            String input;
            input = ui.getScanString();

            switch (input){
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

            }
        }


    }


