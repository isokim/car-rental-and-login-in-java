package stem;

public class car{
    private String numberPlate;
    private String model;
    private boolean available;


public car(String numberPlate, String model) {
    this.numberPlate = numberPlate;
    this.model = model;
    this.available = true;
}

public String getnumberPlate() {
    return numberPlate;
}

public String getmodel() {
    return model;
}

public boolean isAvailable() {
    return available;
}

public void rentCar() {
    if (available) {
        this.available = false;
        System.out.println("Car rented:" + model + "[" + numberPlate + "]");
    } else {
        System.out.println("Car is already rented.");
    }
}

public void returnCar() {
    if(!available) {
        this.available = true;
        System.out.println("Car returned:" + model + "[" + numberPlate + "]");
    } else {
        System.out.print("Car is available.");
    }
}

@Override
public String toString() {
    return model + " [" + numberPlate + "] -" + (available ? "Available" : "Rented");
}
}
