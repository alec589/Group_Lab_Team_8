/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Persona;

/**
 *
 * @author sunzuolin
 */
public class RegistrarProfile extends Profile{
    Person person;
     public RegistrarProfile(Person p){
     
      super(p);
        person = p;   
     }
     public String getrole(){
        return  "Admain";
    }
}
