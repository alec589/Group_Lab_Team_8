/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    float grade; //(Letter grade mappings: A=4.0, A-=3.7, B+=3.3, B=3.0, )        //Lu: this "grade" is actually "gpa"
    Seat seat;
    boolean like; //true means like and false means not like
    CourseLoad courseload;
    Boolean pass;
    
    double score; //Lu: max point is 100 or can be converted to
    String letterGrade;
    
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
        pass= false;
    }
    
    public Boolean ispass(){
        return pass;

    }
    
    public boolean getLike(){
        return like;
    }
    
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public int getCreditHours(){
        return seat.getCourseCredits();
       
    }
    
    public Seat getSeat(){
        return seat;
    }
    
    public CourseOffer getCourseOffer(){
        
        return seat.getCourseOffer();
    }
    
    public Course getAssociatedCourse(){
        
        return getCourseOffer().getSubjectCourse();
    }
    
    public float GetCourseStudentScore(){
        return getCreditHours()*grade;
    }
    
    public StudentProfile getStudentProfile() {
        if (courseload == null) return null;
        return courseload.getTranscript().getStudentProfile();
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }
    
    public void setScore(double score) {
        this.score = score;
        this.letterGrade = convertToLetter(score);
        this.grade = (float) convertToGPA(score);
        this.pass = score >= 60;
    }

    private String convertToLetter(double score) {
        if (score >= 93) return "A";
        else if (score >= 90) return "A-";
        else if (score >= 87) return "B+";
        else if (score >= 83) return "B";
        else if (score >= 80) return "B-";
        else if (score >= 77) return "C+";
        else if (score >= 73) return "C";
        else if (score >= 70) return "C-";
        else if (score >= 67) return "D+";
        else if (score >= 63) return "D";
        else if (score >= 60) return "D-";
        else return "F";
    }
    
    private double convertToGPA(double score) {
        if (score >= 93) return 4.0;
        else if (score >= 90) return 3.7;
        else if (score >= 87) return 3.3;
        else if (score >= 83) return 3.0;
        else if (score >= 80) return 2.7;
        else if (score >= 77) return 2.3;
        else if (score >= 73) return 2.0;
        else if (score >= 70) return 1.7;
        else if (score >= 67) return 1.3;
        else if (score >= 63) return 1.0;
        else if (score >= 60) return 0.7;
        else return 0.0;                                // Lu: if fail, GPA=0.0
    }
}
