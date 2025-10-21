/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Persona.Faculty;

import javax.swing.ImageIcon;

/**
 *
 * @author sunzuolin
 */
public class Assignment {
    private String assignmentName;
    private int maxPoints;
    FacultyProfile facultyprofile;
    private ImageIcon logoImage;
    String Description;
    public Assignment(String name,FacultyProfile fp, int maxPoints) {
        this.assignmentName = name;
        this.facultyprofile =fp;
        this.maxPoints = maxPoints;
       
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
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
