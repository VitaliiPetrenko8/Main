import java.util.Scanner;

public class GuestListProgram {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        insertTestNames();
        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if(option == 1) {
                addGuest();

            } else if(option == 2) {
                removeGuest();

            } else if(option == 3) {
                renameGuest();

            } else if(option == 4) {
                break;
            }

        } while (true);
        System.out.println("Exiting ...");

    }
    static void displayGuests() {
        System.out.println("\n- List of Guests -\n");
                
        int lastNonNullIndex = 0;

        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                guests[lastNonNullIndex++] = guests[i];
            }
        }

        for (int i = lastNonNullIndex; i < guests.length; i++) {
            guests[i] = null;
        }
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println(i + 1 + ". " + guests[i]);
                isEmpty = false;
            }
            //System.out.println(guests[i] == null? i + 1  + ". "+ "--" : i + 1 + ". "+ guests[i]);
        }
        if (isEmpty) {
            System.out.println("Guest list is empty.");
        }
    }
    static void displayMenu() {
        System.out.println("_____________________\n- Menu -\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Exit");

    }
    static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
    static void addGuest() {
        System.out.println("Enter the number: ");
        int guestNum = scanner.nextInt();
        scanner.nextLine();
            if (guests[guestNum-1] == null) {
                System.out.print("Name: ");
                guests[guestNum-1] = scanner.nextLine();
            }else {
                for (int i = guests.length-1; i > guestNum-1; i--) {
                    guests[i] = guests[i-1];
                    if (guests[guestNum-1].equals(guests[guestNum])){
                        System.out.println("Name: ");
                        guests[guestNum-1] = scanner.nextLine();
                        break;
                    }
                }
            }
    }
    static void removeGuest() {
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        /*for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && i == num-1) {
                guests[i] = null;
                break;
            }
        }*/

        if (num > 0 && num <= guests.length && guests[num-1] != null) {
            guests[num-1] = null;
        } else {
            System.out.println("“Error: There is no guest with that number.”");
        }
    }
    static void renameGuest() {
        System.out.print("Enter the number to rename: ");
        int numRename = scanner.nextInt();
        scanner.nextLine();
            if (numRename > 0 && guests[numRename-1] != null) {
                System.out.print("New name: ");
                guests[numRename-1] = scanner.nextLine();

            } else {
                System.out.println("“Error: There is no guest with that number.”");

            }


    }
    static void insertTestNames() {
        guests[0] = "Jacob";
        guests[1] = "Sarah";
        guests[2] = "Carl";
        guests[3] = "Peter";
        guests[4] = "Harold";
    }
}
