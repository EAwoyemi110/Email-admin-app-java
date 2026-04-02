import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department = "Fashion";
    private int mailboxCapacity;
    private int passwordDefaultLength;
    private String altEmail;

    // Constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        this.department = setDept();
        System.out.println("Your department is " + this.department);

    }

    // Call method setting up their department email and return their new email
    private String setDept() {
        System.out.print("DEPT CODES\n1 for sales\n2 for development\n3 for accounting\n0 for none\n");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();


        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else if (departmentChoice == 0) {
            return "None";
        } else {
            return "Please enter a valid number.";
        }
    }


}
//Generate random number and treat password as an array and use number as the index