import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Product, Integer> products = new HashMap<>();

        int option = -1;

        do{
            System.out.println("Select a product to buy:");
            int i = 1;

            for (Product product : products.keySet()) {
                System.out.println(i + ". " + product);
                i++;

            }
            System.out.println("0 to exit");

            option=scanner.nextInt();
            if(option >=1 && option <= products.size()){
                Product selectedProduct = (Product) products.keySet().toArray()[option - 1];
                System.out.println("Enter the quantity to buy:");
                int quantityToBuy = scanner.nextInt();

                if(quantityToBuy <= selectedProduct.getStockQuantity()){
                    selectedProduct.sell(quantityToBuy);
                    System.out.println("Purchase successful");
                    int currentSales = products.get(selectedProduct);
                    products.put(selectedProduct, currentSales + quantityToBuy);

                }else {
                    System.out.println("Product out of stock");
                }
            } else if (option!=0) {
                System.out.println("Invalid option");
            }

        }while (option!=0);
        showBestSellingProducts(products);

    }
    private static void showBestSellingProducts(Map<Product, Integer> products){
        Product bestSellingProduct = null;
        int maxSales = -1;

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int salesCounter = entry.getValue();

            if (salesCounter > maxSales) {
                maxSales = salesCounter;
                bestSellingProduct = product;
            }
        }

        if (bestSellingProduct != null) {
            System.out.println("Best selling product: " + bestSellingProduct.getName() + ". Quantity sold: " + maxSales);
        }
    }


}
