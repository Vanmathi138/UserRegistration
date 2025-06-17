import java.util.Scanner;

public class UserRegistration {
    //attributes
    private String firstName;
    private String lastName;
    private String email;

    // setter
    public void setFirstName (String firstName){
        this.firstName= firstName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //getter
    public String getFirstName(){
        return firstName;
    }
    public String getEmail(){
        return email;
    }
    public String getLastName(){
        return lastName;
    }

    public static boolean isValidName(String firstName){
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserRegistration userRegistration = new UserRegistration();

        System.out.print("Enter first name: ");
        String first_name = scanner.next();
        System.out.print("Enter the last Name: ");
        String last_name = scanner.next();

        if(isValidName(first_name) && isValidName(last_name)){
            userRegistration.setFirstName(first_name);
            userRegistration.setLastName(last_name);
            System.out.println("\nValid first name: "+ userRegistration.getFirstName()+
                    "\nValid last name: "+ userRegistration.getLastName());
        }else {
            System.out.println("First name & Last name should start with a capital letter and be at least 3 characters long.");

        }

    }
}