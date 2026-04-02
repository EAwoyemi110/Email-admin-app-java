import java.util.Scanner;

public class Email {
    private String firstName;

    private String lastName;

    private String password;

    private String department;

    private int mailboxCapacity;

    private int passwordDefaultLength = 10;

    private String altEmail;

    private String email;

    private String companySuffix = "SomethingBuisness.com";

    // Constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        this.department = setDept();
        System.out.println("Your department is " + this.department);

        this.password = randomPassword(passwordDefaultLength);
        System.out.println("Your password is: " + this.password);

        //combine everything to make an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    // Call method setting up their department email and return their new email
    private String setDept() {
        System.out.print("DEPT CODES\n1 for sales\n2 for development\n3 for accounting\n0 for none\n" + "\nEnter: ");
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

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$#%&*(),./";

        char[] password = new char[length];

        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));
        }

        return new String(password);

    }







}
