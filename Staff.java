/*************
 *Class name: Staff
 *Class Description: Staff class that consist of the attributes that represent a Staff
 *                   and provide a String representation of the instance variables.
 --------------------------------------------------------------------------------------------
 *Name: Sameer Ali
 *Version date: 01/22/2024
 *CMSC 256 901
 ***************/

package cmsc256;

public class Staff extends Employee {
    private String title;

    /**
     * Default constructor for the Staff class.
     * Calls the default constructor of the superclass Person.
     */
    public Staff(){
        super();
        title = "None given";
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
     * @param title title of the staff
     */
    public Staff (String firstName, String middleName, String lastName, Address address,
                  String phone, String email, String office, int salary, int month, int day, int year, String title) {
        super(firstName,middleName,lastName,address,phone,email,office,salary,month,day,year);
        this.title = title;
    }


    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Overrides the toString method to provide a formatted string representation of the person's details.
     * @return Formatted string with name, home address, phone number, email, ID, office number, salary, hire date, and title.
     */

    public String toString() {
        return super.toString() + "\n \n" + "Title:  " + title + "\n";
    }
}
