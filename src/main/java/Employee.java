/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Employee {
    protected String FirstName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    protected String LastName;
    protected String socialSecurityNumber;
    // Constructor 
    public Employee(String FirstName, String LastName, String socialSecurityNumber){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    @Override
   public String toString() {
       return String.format("%s,%s,%s", FirstName, LastName,socialSecurityNumber);
   }
    
}
