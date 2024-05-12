/*************
 *Class name: Employee
 *Class Description: Employee class that consist of the attributes that represent an Employee
 *                   and provide a String representation of the instance variables.
 --------------------------------------------------------------------------------------------
 *Name: Sameer Ali
 *Version date: 01/22/2024
 *CMSC 256 901
 ***************/

package cmsc256;
import java.time.LocalDate;

public class Employee extends Person{
private String office;
private int salary;
private LocalDate hireDate;

    /**
     * Default constructor for the Employee class.
     * Calls the default constructor of the superclass Person.
     */
public Employee(){
    super();
    office = "Unassigned";
    salary = 0;
    hireDate = null;
}

    /**
     * @param firstName  First name of the person
     * @param middleName Middle name of the person
     * @param lastName   Last name of the person
     * @param address Address object representing the person's home address
     * @param phone  Person's phone number
     * @param email  Person's email address
     * @param office Employee's office number
     * @param salary Employee's salary
     * @param month Month of hiring
     * @param day Day of hiring
     * @param year Year of hiring
     */
    public Employee(String firstName, String middleName, String lastName, Address address,
                    String phone, String email, String office, int salary, int month, int day, int year) {
        super(firstName, middleName, lastName, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
        if (salary < 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * @return the office number
     */
    public String getOffice() {
        return office;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the hire date
     */
    public LocalDate getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hire date to set
     */
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * Overrides the toString method to provide a formatted string representation of the person's details.
     * @return Formatted string with name, home address, phone number, email, ID, office number, salary, hire date.
     */
    public String toString() {
        String hireDateString = (hireDate != null)
                ? hireDate.getMonthValue() + "/" + hireDate.getDayOfMonth() + "/" + hireDate.getYear()
                : "Not specified";

        return className + super.toString() + "\n" + "Office:  " + office + "\n" + "Salary:  $" + salary + "\n" + "Date Hired:  " + hireDateString + "\n";
    }

}
