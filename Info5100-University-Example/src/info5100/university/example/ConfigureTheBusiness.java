/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Calendar;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.RegisterDirectory;
import info5100.university.example.Persona.RegisterProfile;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.UserAccount;
import info5100.university.example.Persona.UserAccountDirectory;

/**
 *
 * @author sunzuolin
 */
public class ConfigureTheBusiness {
     static Department initialize(){
         Department department = new Department("Information Systems");
        
        PersonDirectory persondirectory = department.getPersondirectory();
          Person person001 = persondirectory.newPerson("John Smit");
          Person person002 = persondirectory.newPerson("Gina Montana");
          Person person003 = persondirectory.newPerson("Adam Rollen");
 
          Person person005 = persondirectory.newPerson("Jim Dellon");
          Person person006 = persondirectory.newPerson("Anna Shnider");
          Person person007 = persondirectory.newPerson("Laura Brown");
          Person person008 = persondirectory.newPerson("Jack While");
          Person person009 = persondirectory.newPerson("Fidelity");
          
          StudentDirectory studentdirectory = department.getStudentdirectory();
          StudentProfile stu1 = studentdirectory.newStudentProfile(person003);
          StudentProfile stu2 = studentdirectory.newStudentProfile(person005);
          
          CourseCatalog coursecatalog = department.getCoursecatalog();
          Course  course1 = coursecatalog.newCourse( "Introduction to Programming", 2);
          Course  course2 = coursecatalog.newCourse( "Data Structures and Algorithms", 2);
          Course  course3 = coursecatalog.newCourse( "Discrete Mathematics", 2);
          Course  course4 = coursecatalog.newCourse( "Computer Organization and Architecture", 2);
          Course  course5 = coursecatalog.newCourse( "Operating Systems", 2);
          Course  course6 = coursecatalog.newCourse( "Database Management Systems", 2);
          Course  course7 = coursecatalog.newCourse( "Principles of Computer Networks", 2);
          Course  course8 = coursecatalog.newCourse( "Software Engineering", 2);
          
          Calendar calendar = department.getCalendar();
          CourseSchedule fallSchedule1 = new CourseSchedule("2025fall", coursecatalog);
          CourseOffer fall_course1 = fallSchedule1.newCourseOffer(course1.getCourseNumber());
          CourseOffer fall_coirse2 = fallSchedule1.newCourseOffer(course2.getCourseNumber());
          calendar.addCourseSchedule("2025fall", fallSchedule1);
          
          CourseSchedule springSchedule = new CourseSchedule("2026spring", coursecatalog);
          CourseOffer spring_course1 = springSchedule.newCourseOffer(course3.getCourseNumber());
          CourseOffer spring_coirse2 = springSchedule.newCourseOffer(course4.getCourseNumber());
          calendar.addCourseSchedule("2026spring", springSchedule);
          
          CourseSchedule summerSchedule = new CourseSchedule("2026summer", coursecatalog);
          CourseOffer summer_course1 = summerSchedule.newCourseOffer(course7.getCourseNumber());
          CourseOffer summerg_coirse2 = summerSchedule.newCourseOffer(course8.getCourseNumber());
          calendar.addCourseSchedule("2026summer", summerSchedule);
          
          CourseSchedule winterSchedule = new CourseSchedule("2025winter", coursecatalog);
          CourseOffer winter_course1 = winterSchedule.newCourseOffer(course5.getCourseNumber());
          CourseOffer winter_coirse2 = winterSchedule.newCourseOffer(course6.getCourseNumber());
          calendar.addCourseSchedule("2025winter", winterSchedule);

          RegisterDirectory registerdirectory = department.getRegisterdirectory();//chunyan
          RegisterProfile reg1 = registerdirectory.newRegisterProfile(person001);
          
          UserAccountDirectory useraccountdirectory = department.getUseraccountdirectory();
          UserAccount   useraccount1 = useraccountdirectory.addUserAccount(stu1, "student1", "123456");
          UserAccount   useraccount2 = useraccountdirectory.addUserAccount(stu2, "student2", "123456");
          UserAccount   useraccount3 = useraccountdirectory.addUserAccount(reg1, "register1", "123456");
          return department;
     }
}
