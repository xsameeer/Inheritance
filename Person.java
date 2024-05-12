/*************
 *Class name: Person
 *Class Description: Parent class that consist of the attributes that represent a Person
 *                   and provide a String representation of the instance variables.
 --------------------------------------------------------------------------------------------
 *Name: Sameer Ali
 *Version date: 01/22/2024
 *CMSC 256 901
 ***************/

package cmsc256;
public class Person {
    private final int id;
    private Name name;
    private Address homeAddress;
    private String phoneNumber;
    private String email;
    private static int recordNumber;

    /*
    * Default constructor for the Student class.
    * Default values for phoneNumber and email are "None given".
     */

    public Person() {

        name = new Name();

        homeAddress = new Address();

        phoneNumber = "None given";

        email = "None given";

        id = ++recordNumber;

    }

    /**
    Sets up this Person object with the specified data
     * @param first  First name of the person
     * @param middle Middle name of the person
     * @param last   Last name of the person
     * @param address Address object representing the person's home address
     * @param phone  Person's phone number
     * @param email  Person's email address
    */
     public Person (String first, String middle, String last, Address address, String phone, String email) {
        this.name = new Name(first, middle, last);
        this.homeAddress = address;
        this.phoneNumber = phone;
        this.email = email;
        this.id = ++recordNumber;

    }

    /**
     * @return the email
     */

    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the homeAddress
     */

    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress the homeAddress to set
     */

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * @return the phoneNumber
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the id
     */

    public int getId() {
        return id;
    }

    /**
     * @return the name
     */

    public String getName() {
        return String.valueOf(name);
    }

    /**
     * @param name the name to set
     */

    public void setName(Name name) {
        this.name = name;
    }

    String className = this.getClass().getSimpleName() + ":";

    /**
     * Overrides the toString method to provide a formatted string representation of the person's details.
     * @return Formatted string with name, home address, phone number, email, and ID.
     */
    public String toString() {
      return "\n" + "---------------------------------------" + "\n" + name + "\n" + "---------------------------------------" + "\n"
              +"Home Address: "+ homeAddress.toString() + "\n" + "Phone Number: "+ phoneNumber + "\n" + "Email Address: " + email + "\n" + "ID: " + id;
    }
}
