// Fig. 9.10: CommissionEmployee.java
// CommissionEmployee class uses methods to manipulate its 
// private instance variables.
public class CommissionEmployee extends Employee{
          
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage
   // five-argument constructor
   public CommissionEmployee(String FirstName, String LastName, String socialSecurityNumber, double grossSales, double commissionRate){
      // implicit call to Object constructor occurs here
super(FirstName,LastName,socialSecurityNumber);
      // if grossSales is invalid throw exception
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }      

              
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // return first name

   // return last name
   

   // return social security number 
   

   // set gross sales amount
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales() {return grossSales;}

   // set commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      } 

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate() {return commissionRate;}

   // calculate earnings
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   } 

   // return String representation of CommissionEmployee object
   @Override 
   public String toString() {
      return String.format("%n%s: %s%n%s: %.2f%n%s: %.2f", 
         "commission employee",  
         "social security number", 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
   } 
} 


