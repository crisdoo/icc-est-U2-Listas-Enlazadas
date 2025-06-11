package Controllers;

import java.util.LinkedList;

import Models.Contact;

public class ContactManage {
    private LinkedList<Contact> contacts;

    public void addContact(Contact contact) {
        if (contacts == null) {
            contacts = new LinkedList<>();
        }
        contacts.add(contact);
    }

   


    public void findContactByName(String name) {
        if (contacts == null || contacts.isEmpty()) {
            System.out.println("");
            return;
        }
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(": " + contact);
                return;
            }
        }
        System.out.println("");
        
    }
    public void deleteContactByName(String name) {
        if (contacts == null || contacts.isEmpty()) {
            System.out.println("");
            return;
        }
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                System.out.println(": " + contact);
                return;
            }
        }
        System.out.println("");
    }
    public void printList() {
        if (contacts == null || contacts.isEmpty()) {
            System.out.println("");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}