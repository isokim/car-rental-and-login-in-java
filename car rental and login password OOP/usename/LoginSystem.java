import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
      
    //Default username and password
     final String defaultUsername = "admin";
     final String defaultPassword = "1234";
     int attempts = 3; //number of allowed attempts

     while (attempts > 0) { // loop until there are no attempts left
      System.out.println("Enter username");
      String user = console.nextLine();

      //Prompt to read password
     System.out.println("Enter password");
     String pass = readPassword(console);

     // check for credentials
     if(user.equals(defaultUsername) && pass.equals(defaultPassword)) {
        System.out.println("\nWelcome Back!");
        console.close();
        return; // Exit the program upon successfull login
     } else {
        attempts--;
        System.out.println("Wrong username or passowrd! Attempts left: " + attempts);
     }
    }
    // if the user exhausts the attempts
    System.out.println("Access denied. Try again later.");
    console.close(); // close the scanner
}
/**
* reads a password fromthe console and displays astericks for each charachter
* Scanner console  to read input
 * returns the password as a string
 */
//to display passoword '*' for each character typed
public static String readPassword(Scanner console) {
    String password = console.nextLine();
   for(int i = 0; i < password.length(); i++ ) { //print an asterick for each caharcter typed in the password
    System.out.print("*");
   }
System.out.println();
return password;
}
}