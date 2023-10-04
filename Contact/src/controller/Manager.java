/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author lekha
 */
public class Manager {

    Validation vl = new Validation();

    //display menu
    public int menu() {
        System.out.println("1. Add a contact.");
        System.out.println("2. Display all contact.");
        System.out.println("3. Delete a contact.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = vl.checkInputIntLimit(1, 4);
        return choice;
    }

    //allow user create contact
    public void createContact(ArrayList<Contact> lc) {
        System.out.print("Enter id contact: ");
        int contactId = vl.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = vl.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = vl.checkInputString();
        System.out.print("Enter group: ");
        String group = vl.checkInputString();
        System.out.print("Enter address: ");
        String address = vl.checkInputString();
        System.out.print("Enter phone: ");
        String phone = vl.checkInputPhone();
        lc.add(new Contact(contactId, firstName + lastName, group, address,
                phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    //allow user display all contact
    public void printAllContact(ArrayList<Contact> lc) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    //allow user delete contact
    public void deleteContactd(ArrayList<Contact> lc) {
        System.out.print("Enter id: ");
        int idDelete = vl.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    //get contact by id
    public Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}
