import java.util.Scanner;

public class GuestListProgram {

    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);
/*
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";

 */

        do {

            displayGuests(guests);
           /* System.out.println("- List of Guests -\n");
            for (int i = 0; i < guests.length; i++) {
                System.out.println(guests[i] == null? "--" : guests[i]);

            }*/
            System.out.println("_____________________\n- Menu -\n");
            System.out.println("1 - Add Guest");
            System.out.println("2 - Remove Guest");
            System.out.println("3 - Exit");
            System.out.println("Option: ");

            int option = scanner.nextInt();
            /*
            if (option == 1) {
                System.out.println("_____________________\n- Guests -\n");
                for (int i = 0; i < guests.length; i++) {
                    System.out.println(guests[i] == null? "--" : guests[i]);

                    }




            } else */ if(option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }

                }

            } else if(option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            } else if(option == 3) {
                break;
            }

        } while (true);

        System.out.println("Exiting ...");
    }

    public static void displayGuests(String[] guests) {
        System.out.println("- List of Guests -\n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println(guests[i] == null? "--" : guests[i]);
        }

    }

}