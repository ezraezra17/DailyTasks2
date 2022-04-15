public class Car {
    public String brand;
    public String model;
    public double price;
    public String color;

    public Car(String brand){
        this.brand= brand;

    }

    public Car(String brand, String model){
        this(brand);
        this.model=model;
    }

    public Car(String brand, String model, double price){
        this(brand,model);
        this.price=price;
    }

    public Car(String brand,String model,double price,String color){
        this(brand,model,price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }

}
