import java.io.*;
import java.util.HashMap;

public class AddressBook implements Serializable {
    private HashMap<String, Contact> contacts;
    private static final String FILE_NAME = "contacts.dat"; // Nombre del archivo para almacenar los contactos

    public AddressBook() {
        this.contacts = new HashMap<>();
        loadContacts(); // Cargar contactos al iniciar la aplicación
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contact added successfully.");
            storeContacts();
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
            System.out.println("Contact deleted.");
            storeContacts(); // Guardar contactos después de eliminar uno
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }

    // para guardar los contactos en un archivo
    private void storeContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    // cargar los contactos desde un archivo
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
}
