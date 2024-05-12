/*************
 *Class name: Faculty
 *Class Description: Faculty class that consist of the attributes that represent a faculty
 *                   and provide a String representation of the instance variables.
 --------------------------------------------------------------------------------------------
 *Name: Sameer Ali
 *Version date: 01/22/2024
 *CMSC 256 901
 ***************/

package cmsc256;

public class Faculty extends Employee {
    private String rank;

    /**
     * Default constructor for the Staff class.
     * Calls the default constructor of the superclass Person.
     */
    public Faculty(){
        super();
        rank = "Instructor";
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
     * @param rank rank of faculty
     * @throws IllegalArgumentException
     */
    public Faculty(String firstName, String middleName, String lastName, Address address, String phone,
                   String email, String office, int salary, int month, int day, int year, String rank) {
        super(firstName,middleName,lastName,address,phone,email,office,salary,month,day,year);
        setRank(rank);

        /*
         * Validates the rank
         */
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        if(isValidRank(rank))
            throw new IllegalArgumentException("The rank must be Adjunct, Instructor, Assistant Professor, Associate Professor, Professor");
        this.rank = rank;
    }

    public boolean isValidRank(String rank){
        if (!(rank.equalsIgnoreCase("Adjunct") || rank.equalsIgnoreCase("Instructor") || rank.equalsIgnoreCase("Assistant Professor")
                || rank.equalsIgnoreCase("Associate Professor") || rank.equalsIgnoreCase("Professor"))) {
            return true;
        }
        return false;
    }


    /**
     * Overrides the toString method to provide a formatted string representation of the person's details.
     * @return Formatted string with name, home address, phone number, email, ID, office number, salary, hire date, and rank.
     */

    public String toString(){
        return super.toString() + "\n" + "Rank:  " + rank + "\n";
    }
}
