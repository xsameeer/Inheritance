/*************
 *Class name: Student
 *Class Description: Student class that consist of the attributes that represent a Student
 *                   and provide a String representation of the instance variables.
 --------------------------------------------------------------------------------------------
 *Name: Sameer Ali
 *Version date: 01/22/2024
 *CMSC 256 901
 ***************/

package cmsc256;
public class Student extends Person {
    private String level;

    /**
     * Default constructor for the Student class.
     * Calls the default constructor of the superclass Person.
     */

    public Student() {
        super();
        level = "Freshman";
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        if(!isValidLevel(level))
            throw new IllegalArgumentException("The level must be Freshman, Sophomore, Junior, Senior, or Graduate");
        this.level = level;
    }

    /**
     * @param firstName  First name of the person
     * @param middleName Middle name of the person
     * @param lastName   Last name of the person
     * @param address Address object representing the person's home address
     * @param phone  Person's phone number
     * @param email  Person's email address
     * @param level Student's level
     */
    public Student(String firstName, String middleName, String lastName, Address address, String phone, String email, String level) {
        super(firstName, middleName, lastName, address, phone, email);
        setLevel(level);
    }

    public boolean isValidLevel(String level){
        if (level.equalsIgnoreCase("Freshman") || level.equalsIgnoreCase("Sophomore") || level.equalsIgnoreCase("Junior")
                || level.equalsIgnoreCase("Senior") || level.equalsIgnoreCase("Graduate")) {
            return true;
        }
        return false;
    }




    /**
     * Overrides the toString method to provide a formatted string representation of the person's details.
     * @return Formatted string with name, home address, phone number, email, ID, and level.
     */
    public String toString() {
        return className +  super.toString() + "\n" + "Student Level:  " + level + "\n";
    }
}
