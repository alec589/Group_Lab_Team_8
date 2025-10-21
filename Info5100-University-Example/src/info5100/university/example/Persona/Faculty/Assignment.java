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
    private String description;
    private int maxPoints;
    
    public Assignment(String name, int maxPoints, String description) {
        this.assignmentName = name;
        this.maxPoints = maxPoints;
        this.description = description;
    }

   
    
    public String getAssignmentName() {
        return assignmentName;
    }

    public int getMaxPoints() {
        return maxPoints;
    }
}
