/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Manager;
import controller.Validation;
import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author lekha
 */
public class Main {

    public static void main(String[] args) {
        Manager mng = new Manager();
        Validation vl = new Validation();
        ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        lc.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        //loop until user want to exit
        while (true) {
            int choice = mng.menu();
            switch (choice) {
                case 1:
                    mng.createContact(lc);
                    break;
                case 2:
                    mng.printAllContact(lc);
                    break;
                case 3:
                    mng.deleteContactd(lc);
                    break;
                case 4:
                    return;
            }
        }
    }

}
