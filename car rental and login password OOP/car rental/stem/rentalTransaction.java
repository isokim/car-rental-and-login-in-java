package stem;
import java.time.LocalDate;

public class rentalTransaction {
    private String transactionID;
    private car rentedCar;
    private customer rentingCustomer;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private boolean paid;

    public rentalTransaction(String transactionID, car rentedCar, customer rentingCustomer, LocalDate rentalDate, LocalDate returnDate, boolean paid) {
    this.transactionID = transactionID;
    this.rentedCar = rentedCar;
    this.rentingCustomer = rentingCustomer;
    this.rentalDate = rentalDate;
    this.returnDate = returnDate;
    this.paid = paid;
} 
public car getRentedCar() {
    return rentedCar;
}

public void setRentedCar(car rentedCar) {
    this.rentedCar = rentedCar;
}

public LocalDate getReturnDate() {
    return returnDate;
}

public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
}
public boolean isPaid() {return paid; }
public void setPaid(boolean paid) {
    this.paid = paid;
}

// to dipslay transaction details
public void displayTransactionDetails() {
    System.out.println("Transaction ID: " + transactionID);
    System.out.println("Car model: " + rentedCar.getmodel() + " ,Number Plate: " + rentedCar.getnumberPlate());
    System.out.println("Customer Name: " + rentingCustomer.getName() );
    System.out.println("Rental Date: " + rentalDate);
    System.out.println("Return Date: " + (returnDate != null ? rentalDate : "Not Returned"));
     System.out.println("Payment Status: " +(paid ? "Paid" : "Pending"));
}
}


