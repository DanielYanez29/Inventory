import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> products;
    private int nextId;

    //Constructor Inventory

    public Inventory() {
        this.products = new ArrayList<>();
        this.nextId = 1;
    }

    //GETTERS AND SETTERS
    private List<Product> getProducts() {
        return products;
    }
    public Product getProductById(int id) {
        products.stream().
                filter(product -> product.getID() == id).findFirst().orElse(null);
        return products.get(id);
    }

    // Register new products

    public void addProduct(String name, double price, int quantity) {
        Product product = new Product(nextId, name, price, quantity);
        products.add(product);
        nextId++;
    }

    //Update

    public boolean updateProduct(int id, double newPrice, int newQuantity) {
        Product product = getProductById(id);
        if (product != null) {
            product.setPrice(newPrice);
            product.setQuantity(newQuantity);
                return true;
                }
        return false;
    }
    //Delete
    public boolean deleteProduct(int id) {
        Product product = getProductById(id);
        if (product != null) {
            products.remove(product);
            return true;
        }
        return false;
    }

}
