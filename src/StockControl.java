public interface StockControl {
    void addStock(int quantity);
    void removeFromStock(int quantity);
    int getStockQuantity();
}
