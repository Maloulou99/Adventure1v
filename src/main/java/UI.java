import java.util.Scanner;

    public class UI {

        Scanner scanner = new Scanner(System.in);

        public int getScanInt(String errorMessage) {
            while (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            }
            int readInt = scanner.nextInt();
            scanner.nextLine();
            return readInt;
        }

        public int getScanInt() {
            return this.getScanInt("Indtastet ikke tilladt, skal indtastes et tal: ");
        }

        public String getScanString() {
            return scanner.nextLine();
        }

        // Reset
        public static final String RESET = "\033[0m";  // Text Reset

        // Tekst i farver
        public static final String sort = "\033[0;30m";   // BLACK
        public static final String rød = "\033[0;31m";     // RED
        public static final String grøn = "\033[0;32m";   // GREEN
        public static final String gul = "\033[0;33m";  // YELLOW
        public static final String blå = "\033[0;34m";    // BLUE
        public static final String lilla = "\033[0;35m";  // PURPLE
        public static final String turkisblå = "\033[0;36m";    // CYAN
        public static final String hvid = "\033[0;37m";   // WHITE

        // Fremhævet farve
        public static final String sort_FH = "\033[1;30m";  // BLACK
        public static final String rød_FH = "\033[1;31m";    // RED
        public static final String grøn_FH = "\033[1;32m";  // GREEN
        public static final String gul_FH = "\033[1;33m"; // YELLOW
        public static final String blå_FH = "\033[1;34m";   // BLUE
        public static final String lilla_FH = "\033[1;35m"; // PURPLE
        public static final String turkisblå_FH = "\033[1;36m";   // CYAN
        public static final String hvid_FH = "\033[1;37m";  // WHITE

        // Understreg
        public static final String sort_understreg = "\033[4;30m";  // BLACK
        public static final String rød_understreg = "\033[4;31m";    // RED
        public static final String grøn_understreg = "\033[4;32m";  // GREEN
        public static final String gul_understreg = "\033[4;33m"; // YELLOW
        public static final String blå_understreg = "\033[4;34m";   // BLUE
        public static final String lilla_understreg = "\033[4;35m"; // PURPLE
        public static final String turkisblå_understreg = "\033[4;36m";   // CYAN
        public static final String hvid_understreg = "\033[4;37m";  // WHITE

        // Baggrund
        public static final String sort_Baggrund = "\033[40m";  // BLACK
        public static final String rød_Baggrund = "\033[41m";    // RED
        public static final String grøn_Baggrund  = "\033[42m";  // GREEN
        public static final String gul_Baggrund = "\033[43m"; // YELLOW
        public static final String blå_Baggrund  = "\033[44m";   // BLUE
        public static final String lilla_Baggrund = "\033[45m"; // PURPLE
        public static final String turkisblå_Baggrund = "\033[46m";   // CYAN
        public static final String hvid_Baggrund  = "\033[47m";  // WHITE

        // Høj lysintensitet
        public static final String sort_HøjLys = "\033[0;93m"; // YELLOW
        public static final String blå_HøjLys = "\033[0;94m";   // BLUE
        public static final String lilla_HøjLys = "\033[0;95m"; // PURPLE
        public static final String turkisblå_HøjLys = "\033[0;96m";   // CYAN
        public static final String hvid_HøjLys = "\033[0;97m";  // WHITE

        // Høj tekst fremhævning
        public static final String sort_Tekst_FM = "\033[1;90m"; // BLACK
        public static final String rød_Tekst_FM = "\033[1;91m";   // RED
        public static final String grøn_Tekst_FM = "\033[1;92m"; // GREEN
        public static final String gul_Tekst_FM = "\033[1;93m";// YELLOW
        public static final String blå_Tekst_FM = "\033[1;94m";  // BLUE
        public static final String lilla_Tekst_FM = "\033[1;95m";// PURPLE
        public static final String turkisblå_Tekst_FM = "\033[1;96m";  // CYAN
        public static final String hvid_Tekst_FM = "\033[1;97m"; // WHITE

        // Høj baggrunds fremhævning
        public static final String sort_FM_baggrund = "\033[0;100m";// BLACK
        public static final String rød_FM_baggrund = "\033[0;101m";// RED
        public static final String grøn_FM_baggrund = "\033[0;102m";// GREEN
        public static final String gul_FM_baggrund = "\033[0;103m";// YELLOW
        public static final String blå_FM_baggrund = "\033[0;104m";// BLUE
        public static final String lilla_FM_baggrund = "\033[0;105m"; // PURPLE
        public static final String turkisblå_FM_baggrund = "\033[0;106m";  // CYAN
        public static final String hvid_FM_baggrund = "\033[0;107m";   // WHITE


    }

