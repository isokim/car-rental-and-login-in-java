package stem.main;

import stem.car;
import stem.customer;
import stem.rentalAgency;
import stem.rentalTransaction;

import java.time.LocalDate;
import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        rentalAgency rentalAgency = new rentalAgency();
        Scanner scanner = new Scanner(System.in);

        // Sample data setup
        rentalAgency.addcar(new car("KDA743B", "Toyota Filder"));
        rentalAgency.addcar(new car("KDB743B", "Mazda Demio"));
        rentalAgency.addcar(new car("KCB743B", "Toyota Axio"));
        rentalAgency.addcar(new car("KDB743B", "Subaru Forester"));
        rentalAgency.addcar(new car("KDV743B", "Toyota Harrier"));
        rentalAgency.addcar(new car("KDC743B", "Toyota Noah"));
        rentalAgency.addcar(new car("KCD743B", "Toyota Voxy"));
        rentalAgency.addcar(new car("KCE743B", "Toyota Land Cruiser"));

        rentalAgency.addcustomer(new customer("415555", "Mark Mwangi", "0766363663"));
        rentalAgency.addcustomer(new customer("132553", "Isaac Omondi", "0746656566"));
        rentalAgency.addcustomer(new customer("3552663", "Bien Braza", "07253653575"));
        rentalAgency.addcustomer(new customer("2879293", "Thomas Edison", "0735746846"));
        rentalAgency.addcustomer(new customer("6464774", "Dinero Majak", "07537573444"));
        rentalAgency.addcustomer(new customer("2535554", "Eugene Mungai", "0725748746"));
        rentalAgency.addcustomer(new customer("255364", "Elijah Munyoki", "07575737333"));
        rentalAgency.addcustomer(new customer("4673773", "Esther Wanjira", "07858575966"));

        // Menu system

while (true) {
    System.out.println("\n Car Rental System");
    System.out.println("1.  View Available Cars");
    System.out.println("2.  Rent a Car");
    System.out.println("3.  Return a Car");
    System.out.println("4. View Customers");
    System.out.println("5. View Transactions");
    System.out.println("6.  Exit");

    int choice = getValidChoice(scanner);
     switch (choice) {
    case 1:
        rentalAgency.listCars();
        break;
    case 2:
        handleRental(scanner,rentalAgency);
        break;
        case 3:
        System.out.println("Enter car number plate:");
        String returnnumberPlate = scanner.nextLine();
        rentalAgency.returnCar(returnnumberPlate);
        break;
    case 4: 
        rentalAgency.listCustomers();
        break;
    case 5: 
        rentalAgency.listTransactions();
        break;
        case 6:
        System.out.println("Exitting...");
        scanner.close();
        return;
    default:
    System.out.println("Invalid option! ");
     }
    }
}

     private static int getValidChoice(Scanner scanner) {
    while (true) {
        System.out.println("Choose an option: ");
        if(scanner.hasNextInt()) {
          int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } else {
            System.out.println("Invalid input! Please enter a number");
            scanner.nextLine();
        }
    }
}

private static void handleRental(Scanner scanner, rentalAgency agency) {
         System.out.print("Enter your ID number: ");
         String idNumber = scanner.nextLine();

         System.out.print("Enter your name: ");
         String name = scanner.nextLine();

         System.out.print("Enter phone number: ");
         String phone = scanner.nextLine();

         System.out.print("Enter car number plate: ");
         String numberPlate = scanner.nextLine();

         System.out.print("Have you made payment (yes/no) ");
         boolean hasPaid = scanner.nextLine().equalsIgnoreCase("yes");

         customer customer = new customer(idNumber, name, phone);
         agency.addcustomer(customer); // store customer info

         LocalDate rentalDate = LocalDate.now();
         agency.rentCar(numberPlate, customer, hasPaid);
         

}
}

