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
