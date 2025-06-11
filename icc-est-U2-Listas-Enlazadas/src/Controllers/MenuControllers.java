package Controllers;

import Views.ConsoleView;

public class MenuControllers {
    private ContactManage contactManage;
    private ConsoleView consoleView;

    public MenuControllers() {
        contactManage = new ContactManage();
        consoleView = new ConsoleView();
    }

    public void showMenu() {
        consoleView = new ConsoleView();
        consoleView.displayMenu();
    }
    private void addContact() {
        consoleView.getline();
        String name = consoleView.getline();
        String phone = consoleView.getline();
        contactManage.addContact(new Models.Contact(name, phone));
        consoleView.showMensage("Contacto agregado: " + name);
       
        
    }
    private void deleteContact() {
        consoleView.getline();
        String name = consoleView.getline();
        contactManage.deleteContactByName(name);
        consoleView.showMensage("Contacto eliminado: " + name);
    }
    private void printList() {
        contactManage.printList();
    }


}
