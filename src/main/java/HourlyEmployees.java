/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class HourlyEmployees extends Employee{
    private double hours;
    private double hourlyWage;
    public HourlyEmployees(String FirstName, String LastName,
            String socialSecurityNumber,double hours,double hourlyWage) {
        super(FirstName, LastName, socialSecurityNumber);
        
        
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0.0 && hours <= 168.0)
        this.hours = hours;
                else this.hours = 0.0;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage < 0.0)
            this.hourlyWage = 0;
        else this.hourlyWage = hourlyWage;
    }
    public double getHourlyWage() {
        return hourlyWage;
       
    }
   

 public double earnings()
{
final double OT=1.5;
if (getHours()<40)
    return getHourlyWage() * getHours();
else 
    return 40 * getHourlyWage() +(getHours() - 40) * getHourlyWage() * OT;
}
 public String toString(){
     return
             super.toString()+
     String.format("%s,%s,%s",getHourlyWage(),getHours(),earnings());
 }   
}
