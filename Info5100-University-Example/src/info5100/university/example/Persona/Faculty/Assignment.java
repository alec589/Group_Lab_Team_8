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
    FacultyProfile facultyprofile;
    public Assignment(String name,FacultyProfile fp, int maxPoints) {
        this.assignmentName = name;
        this.facultyprofile =fp;
        this.maxPoints = maxPoints;
       
    }

    public FacultyProfile getFacultyprofile() {
        return facultyprofile;
    }

   
    
    public String getAssignmentName() {
        return assignmentName;
    }

    public int getMaxPoints() {
        return maxPoints;
    }
    public String toString() {

        return assignmentName;
    }
}
