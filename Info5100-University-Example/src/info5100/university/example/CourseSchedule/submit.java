/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.Persona.Faculty.Assignment;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author sunzuolin
 */
public class submit {
    private StudentProfile student;         
    private Assignment assignment;           
    private int actualScore;                
    private String submissionDetails;       
    private long submissionTimestamp;
    
    public submit(StudentProfile student, Assignment assignment) {
        this.student = student;
        this.assignment = assignment;
        this.actualScore = 0;
        this.submissionTimestamp = System.currentTimeMillis(); 
    }

    public StudentProfile getStudent() {
        return student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public int getActualScore() {
        return actualScore;
    }

    public String getSubmissionDetails() {
        return submissionDetails;
    }

    public void setSubmissionDetails(String submissionDetails) {
        this.submissionDetails = submissionDetails;
    }
    
}
