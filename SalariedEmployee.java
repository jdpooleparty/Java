package hwweek7assign3;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    // four-argument constructor 
    public SalariedEmployee(String first, String last, String ssn, int bdayMonth, int bdayDay, int bdayYear,
            double salary) {
        super(first, last, ssn, bdayMonth, bdayDay, bdayYear); // pass to Employee constructor
        setWeeklySalary(salary); // validate and store salary
    } // end four-argument SalariedEmployee constructor

    // set salary
    public void setWeeklySalary(double salary) {
        if (salary >= 0.0) {
            weeklySalary = salary;
        } else {
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        }
    } // end method setWeeklySalary

    // return salary
    public double getWeeklySalary() {
        return weeklySalary;
    } // end method getWeeklySalary

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getWeeklySalary();
    } // end method earnings

    // return String representation of SalariedEmployee object
    @Override
    public String toString() {
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    } // end method toString
} // end class SalariedEmployee
