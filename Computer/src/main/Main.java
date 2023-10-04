/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.Manager;
import controller.Validation;

/**
 *
 * @author lekha
 */
public class Main {
    public static void main(String[] args) {
    Validation vl = new Validation();
    Manager mng = new Manager();
    while(true){
        int choice = mng.mennu();
        switch(choice){
            case 1:
                mng.normalCalculator();
                break;
            case 2: 
                mng.BMICalculator();
                break;
            case 3:
                return;
        }
    }
    }
}
