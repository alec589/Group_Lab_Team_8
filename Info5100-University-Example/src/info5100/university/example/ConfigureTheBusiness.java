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
import info5100.university.example.Persona.Faculty.Assignment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
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
          Person person001 = persondirectory.newPerson("John Smith");
          Person person002 = persondirectory.newPerson("Gina Montana");
          Person person003 = persondirectory.newPerson("Adam Rollen");
          Person person004 = persondirectory.newPerson("Amy Scott");
          Person person005 = persondirectory.newPerson("Jim Dellon");
          Person person006 = persondirectory.newPerson("Anna Shnider");
          Person person007 = persondirectory.newPerson("Laura Brown");
          Person person008 = persondirectory.newPerson("Jack While");
          Person person009 = persondirectory.newPerson("Fidelity");
          Person person0010 = persondirectory.newPerson("Mark King");
          // Lu: 11-20 are faculties
          Person person0011 = persondirectory.newPerson("Kevin Hill");
          Person person0012 = persondirectory.newPerson("Julia Green");
          Person person0013 = persondirectory.newPerson("Tom Adams");
          Person person0014 = persondirectory.newPerson("Zoe Bennett");
          Person person0015 = persondirectory.newPerson("Chris Nelson");
          Person person0016 = persondirectory.newPerson("Rachel Carter");
          Person person0017 = persondirectory.newPerson("Alex Turner");
          Person person0018 = persondirectory.newPerson("Lucy White");
          Person person0019 = persondirectory.newPerson("Jane Harris");
          Person person0020 = persondirectory.newPerson("Kate Young");
          //
          Person person0021 = persondirectory.newPerson("Robert Clark");
          Person person0022 = persondirectory.newPerson("Lisa Hall");
          Person person0023 = persondirectory.newPerson("James Taylor");
          Person person0024 = persondirectory.newPerson("Sarah Miller");
          Person person0025 = persondirectory.newPerson("Ella Rogers");
          Person person0026 = persondirectory.newPerson("Mary Johnson");
          Person person0027 = persondirectory.newPerson("Emily Wilson");
          Person person0028 = persondirectory.newPerson("Michael Davis");
          Person person0029 = persondirectory.newPerson("Eric Ross");
          Person person0030 = persondirectory.newPerson("Justin Foster");
          
          StudentDirectory studentdirectory = department.getStudentdirectory();
          StudentProfile stu1 = studentdirectory.newStudentProfile(person003);
          StudentProfile stu2 = studentdirectory.newStudentProfile(person005);
          
          FacultyDirectory facultyDirectory =department.getFacultydirectory();
          FacultyProfile fa01 = facultyDirectory.newFacultyProfile(person0011);
          FacultyProfile fa02 = facultyDirectory.newFacultyProfile(person0012);
          FacultyProfile fa03 = facultyDirectory.newFacultyProfile(person0013);
          FacultyProfile fa04 = facultyDirectory.newFacultyProfile(person0014);
          FacultyProfile fa05 = facultyDirectory.newFacultyProfile(person0015);
          FacultyProfile fa06 = facultyDirectory.newFacultyProfile(person0016);
          FacultyProfile fa07 = facultyDirectory.newFacultyProfile(person0017);
          FacultyProfile fa08 = facultyDirectory.newFacultyProfile(person0018);
          FacultyProfile fa09 = facultyDirectory.newFacultyProfile(person0019);
          FacultyProfile fa010 = facultyDirectory.newFacultyProfile(person0020);
          
          //Lu: configure faculty details
          fa01.setFirstName("Kevin");
          fa01.setLastName("Hill");
          fa01.setEmail("kevin@northeastern.edu");
          fa01.setPhoneNumber("999-999-9999");
          fa01.setPosition("Professor");
          fa01.setOfficeLocation("Ell Hall 120");
          
          CourseCatalog coursecatalog = department.getCoursecatalog();
          Course  course1 = coursecatalog.newCourse( "Introduction to Programming", 4);
          Course  course2 = coursecatalog.newCourse( "Data Structures and Algorithms", 5);
          Course  course3 = coursecatalog.newCourse( "Discrete Mathematics", 2);
          Course  course4 = coursecatalog.newCourse( "Computer Organization and Architecture", 2);
          Course  course5 = coursecatalog.newCourse( "Operating Systems", 2);
          Course  course6 = coursecatalog.newCourse( "Database Management Systems", 2);
          Course  course7 = coursecatalog.newCourse( "Principles of Computer Networks", 2);
          Course  course8 = coursecatalog.newCourse( "Software Engineering", 2);
          
          Calendar calendar = department.getCalendar();
          CourseSchedule fallSchedule1 = new CourseSchedule("2025fall", coursecatalog);
          CourseOffer fall_course1 = fallSchedule1.newCourseOffer(course1.getCourseNumber());
          fall_course1.generatSeats(30);
          fall_course1.AssignAsTeacher(fa01);
          fall_course1.setLocation(211, 1, 102);
          fall_course1.setTimeSchedule("Monday", 8, 10);
          
          Assignment assignment1 = new Assignment("Term Project", fa01, 100);
          Assignment assignment2 = new Assignment("Introduction to Java",fa01, 100);
          fall_course1.getFacultyassignment().assignAssignment(assignment1);
          fall_course1.getFacultyassignment().assignAssignment(assignment2);
          
          CourseOffer fall_course2 = fallSchedule1.newCourseOffer(course2.getCourseNumber());
          fall_course2.generatSeats(40);
          calendar.addCourseSchedule("2025fall", fallSchedule1);
          fall_course2.setLocation(316, 1, 105);
          fall_course2.setTimeSchedule("Thursday", 7, 9);
          
          CourseSchedule springSchedule = new CourseSchedule("2026spring", coursecatalog);
          CourseOffer spring_course3 = springSchedule.newCourseOffer(course3.getCourseNumber());
          spring_course3.generatSeats(30);
          spring_course3.AssignAsTeacher(fa02);
          spring_course3.setLocation(113, 3,309);
          spring_course3.setTimeSchedule("Friday", 10, 11);
          Assignment assignment3 = new Assignment("Midterm Project: System Design", fa02,100);
          spring_course3.getFacultyassignment().assignAssignment(assignment3);
          
          
          CourseOffer spring_course2 = springSchedule.newCourseOffer(course4.getCourseNumber());
          spring_course2.generatSeats(30);
          calendar.addCourseSchedule("2026spring", springSchedule);
          spring_course2.setLocation(813, 7,732);
          spring_course2.setTimeSchedule("Friday", 13, 15);
          
          CourseSchedule summerSchedule = new CourseSchedule("2026summer", coursecatalog);
          CourseOffer summer_course1 = summerSchedule.newCourseOffer(course7.getCourseNumber());
          summer_course1.generatSeats(30);
          summer_course1.setLocation(413, 3,301);
          summer_course1.setTimeSchedule("Monday", 14, 16);
          CourseOffer summerg_course2 = summerSchedule.newCourseOffer(course8.getCourseNumber());
          summerg_course2.generatSeats(30);
          summerg_course2.setLocation(513, 2,211);
          summerg_course2.setTimeSchedule("Friday", 19, 20);
          calendar.addCourseSchedule("2026summer", summerSchedule);
          
          CourseSchedule winterSchedule = new CourseSchedule("2025winter", coursecatalog);
          CourseOffer winter_course1 = winterSchedule.newCourseOffer(course5.getCourseNumber());
          winter_course1.generatSeats(30);
          winter_course1.setTimeSchedule("Saturday", 15, 16);
          winter_course1.setLocation(111, 2, 205);
          CourseOffer winter_course2 = winterSchedule.newCourseOffer(course6.getCourseNumber());
          winter_course2.generatSeats(30);
          winter_course2.setLocation(761, 6, 605);
          winter_course2.setTimeSchedule("Sunday", 15, 17);
          calendar.addCourseSchedule("2025winter", winterSchedule);

          RegisterDirectory registerdirectory = department.getRegisterdirectory();//chunyan
          RegisterProfile reg1 = registerdirectory.newRegisterProfile(person001);
          
          UserAccountDirectory useraccountdirectory = department.getUseraccountdirectory();
          UserAccount   useraccount1 = useraccountdirectory.addUserAccount(stu1, "student1", "123456");
          UserAccount   useraccount2 = useraccountdirectory.addUserAccount(stu2, "student2", "123456");
          UserAccount   useraccount3 = useraccountdirectory.addUserAccount(reg1, "register1", "123456");
          //Lu: 11-20 are faculty accounts
          UserAccount   useraccount11 = useraccountdirectory.addUserAccount(fa01, "faculty1", "123456");
          UserAccount   useraccount12 = useraccountdirectory.addUserAccount(fa02, "faculty2", "123456");
          UserAccount   useraccount13 = useraccountdirectory.addUserAccount(fa03, "faculty3", "123456");
          UserAccount   useraccount14 = useraccountdirectory.addUserAccount(fa04, "faculty4", "123456");
          UserAccount   useraccount15 = useraccountdirectory.addUserAccount(fa05, "faculty5", "123456");
          UserAccount   useraccount16 = useraccountdirectory.addUserAccount(fa06, "faculty6", "123456");
          UserAccount   useraccount17 = useraccountdirectory.addUserAccount(fa07, "faculty7", "123456");
          UserAccount   useraccount18 = useraccountdirectory.addUserAccount(fa08, "faculty8", "123456");
          UserAccount   useraccount19 = useraccountdirectory.addUserAccount(fa09, "faculty9", "123456");
          UserAccount   useraccount20 = useraccountdirectory.addUserAccount(fa010, "faculty10", "123456");
          
          
          
          return department;
     }
}
