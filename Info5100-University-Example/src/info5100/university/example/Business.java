/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.PersonDirectory;

import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.UserAccountDirectory;

/**
 *
 * @author sunzuolin
 */
public class Business {
    String Name;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    UserAccountDirectory useraccountdirectory;
    PersonDirectory persondirectory;
    
    public Business(String n, Department d ){
        Name = n ;
        studentdirectory = new StudentDirectory(d);
        facultydirectory = new FacultyDirectory(d);
        useraccountdirectory = new UserAccountDirectory(d);
        persondirectory = new PersonDirectory();
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public String getName() {
        return Name;
    }

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }
    
}
