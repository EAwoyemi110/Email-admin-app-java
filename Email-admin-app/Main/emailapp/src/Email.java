package EmailApp;
public class Email {
    private String firstName;

    private String lastName;

    private String password;

    private String department = "Fashion";

    private int mailboxCapacity;

    private String altEmail;

    //Access through class APIs

    //Constructor to recieve first and last name
    //Dept set
    //Generate random password
    //Set Alt email
    //Change password
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
