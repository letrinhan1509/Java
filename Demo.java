import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
		int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        number = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
		// Displaying the number 
		System.out.println("The number entered by user: "+number);
        if(number > 0) {
			System.out.println(number+" is positive number");
		} else if(number < 0) {
			System.out.println(number+" is negative number");
		} else {
			System.out.println(number+" is neither positive nor negative");
		}
    }
}