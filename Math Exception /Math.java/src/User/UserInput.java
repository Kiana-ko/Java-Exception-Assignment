
package User;


import java.util.Scanner; 


public class UserInput {
    public static int getNumberFromTheUser() {
        Scanner userInput = new Scanner(System.in); // Creating a scanner class
        System.out.print("PLS enter a number: ");
        int insertedNum = userInput.nextInt(); // Using nextInt() method to read the Integer that user types
        return insertedNum; // Resturing the inserted number as an integar
    }


    public static int getFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(", the input number must be a non-negative number!");
        } // This throws an error if the instered number is less than 0/ negetive!

        int result = 1;
        int n = 1;
        while (n <= number) {
            result = result * n;
            n++;
        }
        return result;        
    }  
}

