package stem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class rentalAgency {
    private List<car> cars;
    private List<customer> customers;
    private List<rentalTransaction> transactions;
    private int transactionsCounter;

    public rentalAgency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.transactionsCounter = 1;
    }

    // Fixed method syntax and structure
    public void returnCar(String numberPlate) {
        boolean found = false;
        for (rentalTransaction transaction : transactions) {
            if (transaction.getRentedCar().getnumberPlate().equals(numberPlate) // Fixed missing parentheses
                && transaction.getReturnDate() == null) { 
                transaction.getRentedCar().returnCar();
                transaction.setReturnDate(LocalDate.now()); // Fixed missing parenthesis
                System.out.println("Car successfully returned!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No active rental found for this car");
        }
    }

    // Fixed rentCar method
    public void rentCar(String numberPlate, customer customer, boolean hasPaid) {
        if (!hasPaid) {
            System.out.println("Payment required to rent a car!");
            return;
        }
        for (car car : cars) {
            if (car.getnumberPlate().equals(numberPlate)) {
                if (car.isAvailable()) {
                    car.rentCar();
                    String transactionID = "SQ" + transactionsCounter++;
                    LocalDate today = LocalDate.now();
                    rentalTransaction transaction = new rentalTransaction(
                        transactionID, car, customer, today, null, true
                    );
                    transactions.add(transaction);
                    // Fixed transaction ID display
                    System.out.println("Car rented successfully. Transaction ID: " + transactionID);
                } else {
                    System.out.println("Car is already rented.");
                }
                return;
            }
        }
        System.out.println("No car found in our category.");
    }

    // Rest of your methods remain the same
    public void addTransaction(rentalTransaction transaction) {
        transactions.add(transaction);
    }

    public void listTransactions() {
        for (rentalTransaction transaction : transactions) {
            transaction.displayTransactionDetails();
            System.out.println("");
        }
    }

    public void addcar(car car) {
        cars.add(car);
    }

    public void addcustomer(customer customer) {
        customers.add(customer);
    }

    public void listCustomers() {
        for (customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void listCars() {
        for (car car : cars) {
            System.out.println(car);
        }
    }
}