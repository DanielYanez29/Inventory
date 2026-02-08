public class Product {
    private String name;
    private double price;
    private int quantity;
    private int ID;

    //Construct
    public Product(int ID, String name, double price, int quantity) {

        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Getters
    public int getID() {return ID;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}

    //Setters
    private void setID(int ID) {this.ID = ID;}
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    @Override
    public String toString() {
        return "ID: " + ID +
                ", Name: " + name +
                ", Price: " + price +
                ", Quantity: " + quantity;
    }



}
