import java.util.Scanner;

public class UserRegistration {
    //attributes
    private String firstName;
    private String email;

    // setter
    public void setFirstName (String firstName){
        this.firstName= firstName;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //getter
    public String getFirstName(){
        return firstName;
    }
    public String getEmail(){
        return email;
    }

    public static boolean isValidName(String firstName){
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserRegistration userRegistration = new UserRegistration();

        System.out.print("Enter first name: ");
        String first_name = scanner.next();

        if(isValidName(first_name)){
            userRegistration.setFirstName(first_name);
            System.out.println("\nValid first name: "+ userRegistration.getFirstName());
        }else {
            System.out.println("First name should start with a capital letter and be at least 3 characters long.");

        }
    }
}