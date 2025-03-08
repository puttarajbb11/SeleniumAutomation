package Constructor;

public class ConstructorExample {
    String brand;
    String colour;
    float price;

    public ConstructorExample() {
        this.brand = "Default Brand";
        this.colour = "Default Colour";
        this.price = 0.0f;
        System.out.println("Default constructor");
    }

    public ConstructorExample(String brand, String colour, float price) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand is " + brand);
        System.out.println("Colour  is " + colour);
        System.out.println("Price is " + price);
    }

    public static void main(String[] args) {
        ConstructorExample c = new ConstructorExample();
        ConstructorExample c1 = new ConstructorExample("x1", "d1", 20);
        ConstructorExample c2 = new ConstructorExample("y1", "d2", 50);

        c.display();
        c1.display();
        c2.display();
    }
}
