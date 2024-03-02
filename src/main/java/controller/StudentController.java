/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;

/**
 *
 * @author Bravo
 */
public class StudentController extends Menu<String> {
    static String[] options = {"Add Students","Sort and Display","Exit"};
    IStudentRepository studentRepo;
    public StudentController() {
        super("====== Collection Sort Program ======", options);
        studentRepo = new StudentRepository();
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                studentRepo.addStudent();
                break;
            case 2:
                studentRepo.SortAndDisplay();
                break;
            case 3:
                System.exit(0);
        }
    }
    
}
    
