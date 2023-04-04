class BasePlusCommissionEmployee1 {

        private CommissionEmployee commissionEmployee;
        private double baseSalary;
// Constuctor
        public BasePlusCommissionEmployee1(String firstName, String lastName, 
                String socialSecurityNumber, double grossSales,
                        double commissionRate, double baseSalary) {
                commissionEmployee = new CommissionEmployee(firstName, 
                        lastName, socialSecurityNumber, grossSales,
                                commissionRate);

                if (baseSalary < 0.0);
                this.baseSalary = baseSalary;
        }
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0);
this.baseSalary = baseSalary;
        }

        public double getBaseSalary() {
                return baseSalary;
        }
        public double earnings() {
                return getBaseSalary() + commissionEmployee.earnings();
        }
        public String toString() {
                return String.format("%s %s%n%s: %.2f", "base-salaried", commissionEmployee.toString(), "base salary",
                                getBaseSalary());
        }

        public double getCommissionRate() {
                return commissionEmployee.getCommissionRate();
        }

       
        public String getFirstName() {
                return commissionEmployee.getFirstName();
        }

       
        public String getLastName() {
                return commissionEmployee.getLastName();
        }

       
        public String getSocialSecurityNumber() {
                return commissionEmployee.getSocialSecurityNumber();
        }

        
        public void setGrossSales(double grossSales) {
                commissionEmployee.setGrossSales(grossSales);
        }
        public double getGrossSales() {
                return commissionEmployee.getGrossSales();
        }

        public void setCommissionRate(double commissionRate) {
                commissionEmployee.setCommissionRate(commissionRate);
        }
}