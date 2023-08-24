import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void showBestSellingProducts(ArrayList<Product> products){
        Product bestSellingProduct = null;
        int maxSales = -1;

        for(Product product : products){
            if(product.getSalesCounter() > maxSales){
                maxSales=product.getSalesCounter();
                bestSellingProduct=product;
            }
        }

        if(bestSellingProduct!=null){
            System.out.println("Best selling product: "+bestSellingProduct +". Quantity sold: "+bestSellingProduct.getSalesCounter());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        int option = -1;

        do{
            System.out.println("Select a product to buy:");
            for (int i = 1; i-1 < products.size(); i++) {
                System.out.println(i+1+". "+products.get(i));
            }
            System.out.println("0 to exit");

            option=scanner.nextInt();
            if(option >=1 && option <= products.size()){
                Product selectedProduct = products.get(option-1);
                System.out.println("Enter the quantity to buy:");
                int quantityToBuy = scanner.nextInt();

                if(quantityToBuy <= selectedProduct.getStockQuantity()){
                    selectedProduct.sell(quantityToBuy);
                    System.out.println("Purchase successful");
                }else {
                    System.out.println("Product out of stock");
                }
            } else if (option!=0) {
                System.out.println("Invalid option");
            }

        }while (option!=0);
    }
    private static void showBestSellingProducts(){
        Product bestSellingProduct = null;
        int maxSales = -1;

    }
}