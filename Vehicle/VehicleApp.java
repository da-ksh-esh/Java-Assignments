import java.util.Scanner;
class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private double engineCapacity;
    // Constructor
    Vehicle(String brandName, String modelName, int manufactureYear, double currentMileage, double engineCC) {
        brand = brandName;
        model = modelName;
        year = manufactureYear;
        mileage = currentMileage;
        engineCapacity = engineCC;
    }
    // Getter methods
    String getBrand() {
        return brand;
    }
    String getModel() {
        return model;
    }
    int getYear() {
        return year;
    }
    double getMileage() {
        return mileage;
    }
    // Method to update mileage
    void addTripDistance(double distance) {
        mileage = mileage + distance;
    }
    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("----------------------------");
    }
}
class VehicleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[5];
        int count = 0;
        int choice;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Add vehicle");
            System.out.println("2. Display all vehicles");
            System.out.println("3. Update Mileage");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count >= vehicles.length) {
                        System.out.println("Vehicle list is full!");
                        break;
                    }
                    System.out.print("Enter brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Enter model: ");
                    String model = sc.nextLine();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter mileage: ");
                    double mileage = sc.nextDouble();
                    System.out.print("Enter engine capacity: ");
                    double engineCC = sc.nextDouble();
                    vehicles[count] = new Vehicle(brand, model, year, mileage, engineCC);
                    count++;
                    System.out.println("Vehicle added successfully!");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No vehicles available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            vehicles[i].displayDetails();
                        }
                    }
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("No vehicles available.");
                        break;
                    }
                    System.out.print("Enter vehicle index (0 to " + (count - 1) + "): ");
                    int index = sc.nextInt();
                    if (index < 0 || index >= count) {
                        System.out.println("Invalid index!");
                        break;
                    }
                    System.out.print("Enter distance travelled: ");
                    double distance = sc.nextDouble();
                    vehicles[index].addTripDistance(distance);
                    System.out.println("Mileage updated successfully!");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
