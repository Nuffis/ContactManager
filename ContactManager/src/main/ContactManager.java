package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactManager {
    private HashMap<String, Contacts> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(Contacts contact) {
        contacts.put(contact.getId(), contact);
    }

    public void deleteContact(String id) {
        contacts.remove(id);
    }

    public Contacts searchContact(String id) {
        return contacts.get(id);
    }

    public void displayAllContacts() {
        for (Map.Entry<String, Contacts> entry : contacts.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        ContactManager cm = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    cm.addContact(new Contacts(id, name, phone, email));
                    break;
                case 2:
                    System.out.print("Enter ID to delete: ");
                    id = scanner.nextLine();
                    cm.deleteContact(id);
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    id = scanner.nextLine();
                    Contacts contact = cm.searchContact(id);
                    if (contact != null) {
                        System.out.println(contact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    cm.displayAllContacts();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}