package hwweek7assign3;

import java.util.Scanner;

public class PayrollSystemTest {

    public static void main(String[] args) {
        //user info
        System.out.println("Jonathan Poole – D03 - Assignment 7.3\n");

        //create scanner to read user date input
        Scanner reader = new Scanner(System.in);

        //prompt user for current date to check if any employees have same birth month
        System.out.println("Please enter the current date (MM-DD-YYYY) pressing 'enter' after each set of digits");
        System.out.println("Ie. For 11-22-1963, type 11(enter) 22(enter) 1963(enter)");
        Date newDate = new Date(reader.nextInt(), reader.nextInt(), reader.nextInt());

        // create employee subclass objects
        SalariedEmployee salariedEmployee
                = new SalariedEmployee("John", "Smith", "111-11-1111", 11, 22, 63, 800.00);
        HourlyEmployee hourlyEmployee
                = new HourlyEmployee("Karen", "Price", "222-22-2222", 2, 22, 64, 16.75, 40);
        CommissionEmployee commissionEmployee
                = new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 4, 22, 65, 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee
                = new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5, 22, 66, 5000, .04, 300);

        //create employee array for 4 subclasses
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employee Payroll Information:\n");

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // downcast Employee reference to 
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee
                        = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());
            } // end if
            //check if current month matches employee birthday month and if so add 100 to earnings
            if (newDate.getMonth() == currentEmployee.getBirthdayMonth()) {
                System.out.printf(
                        "%s earned an extra $100 this month for their birthday! Total earnings: $%,.2f\n\n", currentEmployee.getFirstName(), currentEmployee.earnings() + 100);
                //if not birthday month, process earnings normally
            } else {
                System.out.printf(
                        "earned $%,.2f\n\n", currentEmployee.earnings() + 100);
            }
        } // end for

    } // end main
} // end class PayrollSystemTest

