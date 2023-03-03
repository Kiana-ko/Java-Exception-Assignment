
import User.UserInput; //Importing our package

public class App {
    public static void main(String[] args) {
        System.out.println("=== USER INPUT APP ===");
        try {
            int n = UserInput.getNumberFromTheUser(); // Calling a method to  get the input from user and storing it in a variable
            int result = UserInput.getFactorial(n);// Calling getFactorial() method from the  which expects the user to type an integar and returns the factorial of the typed number!
            System.out.println("The factorial of inputed number" + " " + "is" + " " + result + " " + "!");
        } catch (IllegalArgumentException ThrownNerror) { // Catching the IllegalArgumentException using the catch blcok and assigning it to a variable called ThrowNerror!
            System.out.println("OOPS" + ThrownNerror.getMessage()); // Finally using .getMessage() method to return/ print out the error that might occour !
        }
    }
}

