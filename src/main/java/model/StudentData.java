/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Validation;
import java.util.ArrayList;

/**
 *
 * @author Bravo
 */
public class StudentData {
    private static StudentData instance = null;
    Validation validation = new Validation();

    public static StudentData Instance() {
        if (instance == null)
            synchronized (StudentData.class) {
            if (instance == null) {
                instance = new StudentData();
            }
        }
        return instance;        
    }
    
    public void addStudent(ArrayList<Student> studentList) {
        do {            
            System.out.println("Please input student information: ");
            String name = validation.inputString("Name: ", "^[a-zA-Z\s]*$");
            String classes = validation.inputString("Classes: ", "^[a-zA-Z0-9\s]*$");
            double mark = validation.inputDouble("Mark: ", 0);
            studentList.add(new Student(name, classes, mark));
            System.out.println("Do you want to add more student? ");
        } while (validation.checkInputYN());
    }
}
