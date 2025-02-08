package stem;

public class customer {
    private String name;
    private String phoneNumber;
    private String  idNumber;

    public customer(String name, String phoneNumber, String idNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
    }
    
    public String getName() {
        return name;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getidNumber() {
        return idNumber;
    }
    
    @Override 
    public String toString() {
        return "Customer: " + name + " (ID: " + idNumber + ", Phone: " + phoneNumber + ")";
    }
}