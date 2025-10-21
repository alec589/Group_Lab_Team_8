/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Persona.Faculty;

/**
 *
 * @author sunzuolin
 */
public class Assignment {
    private String assignmentName;
    private int maxPoints;
    
    public Assignment(String name, int maxPoints) {
        this.assignmentName = name;
        this.maxPoints = maxPoints;
       
    }

   
    
    public String getAssignmentName() {
        return assignmentName;
    }

    public int getMaxPoints() {
        return maxPoints;
    }
}
