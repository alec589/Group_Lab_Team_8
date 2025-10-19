/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.UserAccount;
import info5100.university.example.Persona.UserAccountDirectory;

/**
 *
 * @author sunzuolin
 */
public class ConfigureTheBusiness {
     static Business initialize(){
         Department myDepartment = new Department("Information Systems");
        Business business = new Business("Library Management System",myDepartment);
        PersonDirectory persondirectory = business.getPersondirectory();
          Person person001 = persondirectory.newPerson("John Smit");
          Person person002 = persondirectory.newPerson("Gina Montana");
          Person person003 = persondirectory.newPerson("Adam Rollen");
 
          Person person005 = persondirectory.newPerson("Jim Dellon");
          Person person006 = persondirectory.newPerson("Anna Shnider");
          Person person007 = persondirectory.newPerson("Laura Brown");
          Person person008 = persondirectory.newPerson("Jack While");
          Person person009 = persondirectory.newPerson("Fidelity");
          
          StudentDirectory studentdirectory = business.getStudentdirectory();
          StudentProfile stu1 = studentdirectory.newStudentProfile(person003);
          StudentProfile stu2 = studentdirectory.newStudentProfile(person005);
          
          UserAccountDirectory useraccountdirectory = business.useraccountdirectory;
          UserAccount   useraccount1 = useraccountdirectory.addUserAccount(stu1, "student1", "123456");
          UserAccount   useraccount2 = useraccountdirectory.addUserAccount(stu2, "student2", "123456");
          return business;
     }
}
