package solve_problems.Java_class_Anudhip;
public class Consector_car {
    String brand;
    String model;
    double price;
    // Constructor
    Consector_car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // Display details
    void display() {
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
    }

    public static void main(String[] args) {
        Consector_car c1 = new Consector_car("Toyota", "Fortuner", 3500000);
        c1.display();
    }
}  

