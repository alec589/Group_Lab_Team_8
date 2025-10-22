/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author luwang
 */
public class StudentAssignment {
    private Assignment assignment;        
    private StudentProfile student;
    private boolean isCompleted;
    
    public StudentAssignment(){
        isCompleted = false;      // default status is not completed
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    
    
}
