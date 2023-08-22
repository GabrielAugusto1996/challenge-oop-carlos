public class Product implements ProductActions, StockControl {

    private String name;
    private String type;
    private int quantity;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String name, String type, int quantity) {
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public void sell(int quantity) {

    }

    @Override
    public void addStock(int quantity) {

    }

    @Override
    public void removeFromStock(int quantity) {

    }

    @Override
    public int getStockQuantity() {
        return 0;
    }
}
