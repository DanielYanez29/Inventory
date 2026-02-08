import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        while(true) {
            System.out.println("Menu");
            System.out.println("Welcome to my first CRUD in JAVA");
            System.out.println("1. Create Product");
            System.out.println("2. Read Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Enter Product name");
                    String name = sc.nextLine();
                    System.out.println("Enter Product price");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Product quantity");
                    int quantity = sc.nextInt();
                    inventory.addProduct(name, price, quantity);
                    System.out.println("Product has been created");
                    break;
                case 2:
                    System.out.println("Enter Product id");
                    int id = sc.nextInt();
                    Product product = inventory.getProductById(id);
                    if (product!=null)
                        System.out.println(product);
                    else
                        System.out.println("Product not found");
                    break;

                case 3:
                    System.out.println("Enter Product id");
                    int bId = sc.nextInt();
                        System.out.println("Enter Product  new price");
                        double newPrice = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Enter Product new quantity");
                        int newQuantity = sc.nextInt();
                        inventory.updateProduct(bId, newPrice, newQuantity);
                        System.out.println("Product has been created");
                case 4:
                    System.out.println("Enter Product id");
                    int newId = sc.nextInt();
                    inventory.deleteProduct(newId);
                    System.out.println("Product has been deleted");

                case 5:
                    System.exit(0);



            }
        }
    }


}
