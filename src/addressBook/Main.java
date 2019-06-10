package addressBook;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Contact c = new Contact();
        int option;
        while (true) {
            System.out.println("-------------MENU---------------");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please select an option: 1|2|3|4");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            sc.nextLine();
            if (option == 1) {
                c.add();
            } else if (option == 2) {
                System.out.println("Please insert that person's name to find his phone number: ");
                String name = sc.nextLine();
                c.find(name);
            } else if (option == 3) {
                c.display();
            } else if (option == 4) {
                System.out.println("Goodbye!");
                System.exit(1);
            } else {
                System.out.println("Please select an option from 1 to 4.");
            }
        }
    }
}
