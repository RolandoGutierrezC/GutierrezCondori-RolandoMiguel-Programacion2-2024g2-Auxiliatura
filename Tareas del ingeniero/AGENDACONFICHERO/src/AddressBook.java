import java.io.*;
import java.util.HashMap;

public class AddressBook implements Serializable {
    private HashMap<String, Contact> contacts;
    private static final String FILE_NAME = "contacts.dat"; 

    public AddressBook() {
        this.contacts = new HashMap<>();
        loadContacts(); 
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            storeContacts(); 
            System.out.println("Contact added successfully.");
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
            return;
        }
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }

    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            System.out.println(contacts.get(email));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            storeContacts(); 
            System.out.println("Contact deleted.");
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }

    private void storeContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    private void loadContacts() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                contacts = (HashMap<String, Contact>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading contacts: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Contact contact1 = new Contact("John Doe", "john.doe@example.com", 30, "123-456-7890");
        Contact contact2 = new Contact("Jane Smith", "jane.smith@example.com", 25, "987-654-3210");

        addressBook.addContact(contact1);
        addressBook.addContact(contact2);


        addressBook.viewContacts();

        addressBook.searchContact("john.doe@example.com");

        addressBook.deleteContact("jane.smith@example.com");

        addressBook.viewContacts();
    }
}
