import java.util.Scanner;

public class UserRegistration {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Validations
    public static boolean isValidName(String name) {
        return name.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@bl\\.co(\\.[a-zA-Z]{2,}){1,2}$");
    }

    public static boolean isValidMobileNumber(String phoneNumber) {
        return phoneNumber.matches("^\\+\\d{1,3}[ ]?\\d{10}$");
    }
    public static boolean isPasswordValid(String password){
        return password.length()>=8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserRegistration user = new UserRegistration();

        System.out.print("Enter first name: ");
        String firstName = scanner.next();

        System.out.print("Enter last name: ");
        String lastName = scanner.next();

        System.out.print("Enter email id: ");
        String email = scanner.next();

        scanner.nextLine();

        System.out.print("Enter valid mobile number with country code: ");
        String mobileNumber = scanner.nextLine();

        System.out.println("Rule 1: Minimum 8 characters");
        System.out.print("Enter password: ");
        String password = scanner.next();

        boolean validName = isValidName(firstName) && isValidName(lastName);
        boolean validEmail = isValidEmail(email);
        boolean validMobile = isValidMobileNumber(mobileNumber);
        boolean validPassword = isPasswordValid(password);

        if (validName) {
            user.setFirstName(firstName);
            user.setLastName(lastName);
            System.out.println("\nValid first name: " + user.getFirstName() +
                    "\nValid last name: " + user.getLastName());
        } else {
            System.out.println("First name & Last name must start with a capital letter and have at least 3 characters.");
        }

        if (validEmail) {
            user.setEmail(email);
            System.out.println("Valid email: " + user.getEmail());
        } else {
            System.out.println("Invalid email format. Example: abc.xyz@bl.co.in");
        }

        if (validMobile) {
            System.out.println("Valid mobile number.");
        } else {
            System.out.println("Invalid mobile number. Expected format: +91 9876543210");
        }

        if (validPassword) {
            System.out.println("Password is valid ");
        } else {
            System.out.println("Password is invalid. It must be at least 8 characters long.");
        }
        scanner.close();
    }
}
