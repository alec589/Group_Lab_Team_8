/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Persona;

/**
 *
 * @author sunzuolin
 */
public class RegisterProfile extends Profile{
    Person person;
     public RegisterProfile(Person p){
     
      super(p);
        person = p;   
     }
     
     public String getrole(){
        return  "Register";
    }
     
       public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
}
