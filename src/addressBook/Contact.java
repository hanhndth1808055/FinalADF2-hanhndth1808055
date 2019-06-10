package addressBook;

import java.util.HashMap;
import java.util.Scanner;

public class Contact {
    HashMap<String, String> addressBook = new HashMap<String, String>();

    public Contact() {
    }

    public HashMap<String, String> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(HashMap<String, String> addressBook) {
        this.addressBook = addressBook;
    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert Name: ");
        String name = sc.nextLine();
        System.out.println("Please insert Phone number: ");
        String phone = sc.nextLine();
        addressBook.put(name, phone);
    }

    public void display(){
        String leftAlignFormat = "| %-28s | %-13s |%n";
        System.out.format("+----------------------------------------------+%n");
        System.out.format("|                  Address Book                |%n");
        System.out.format("+------------------------------+---------------+%n");
        System.out.format("| Contact Name                 | Phone Number  |%n");
        System.out.format("+------------------------------+---------------+%n");
        for (String i: addressBook.keySet()){
            System.out.format(leftAlignFormat, i, addressBook.get(i));
        }
        System.out.format("+----------------------------------------------+%n");
    }

    public void find(String a){
        if (addressBook.get(a) != null){
            System.out.println("The phone number of " + a + " is " + addressBook.get(a));
        } else {
            System.out.println("Not found.");
        }
    }
}
