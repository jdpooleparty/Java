package hwweek7assign3;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private int birthdateMonth;
    private int birthdateDay;
    private int birthdateYear;

    // three-argument constructor
    public Employee(String first, String last, String ssn, int bdayMonth, int bdayDay, int bdayYear) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        birthdateMonth = bdayMonth;
        birthdateDay = bdayDay;
        birthdateYear = bdayYear;
    } // end four-argument Employee constructor

    // set first name
    public void setFirstName(String first) {
        firstName = first; // should validate
    } // end method setFirstName

    // return first name
    public String getFirstName() {
        return firstName;
    } // end method getFirstName

    // set last name
    public void setLastName(String last) {
        lastName = last; // should validate
    } // end method setLastName

    // return last name
    public String getLastName() {
        return lastName;
    } // end method getLastName

    // set social security number
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn; // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    // set employee birthday month (+100 during bday month)
    public void setBirthdayMonth(int bdayMonth) {
        birthdateMonth = bdayMonth; // should validate
    } // end method setBirthdayMonth

    // return Employee Birthday Month (+100 during bday month)
    public int getBirthdayMonth() {
        return birthdateMonth;
    } // end method getBirthdayMonth

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    } // end method toString

    // abstract method overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
} // end abstract class Employee

