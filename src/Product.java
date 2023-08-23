public class Product implements ProductActions, StockControl {

    private String name;
    private String type;
    private int quantity;

    private int salesCounter=0;


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSalesCounter(){ return salesCounter; }

    public Product(String name, String type, int quantity) {
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public void sell(int quantity) {
        if(this.quantity >= quantity){
            this.quantity-=quantity;
            this.salesCounter+=quantity;
            System.out.println(quantity+" "+name+" sold.");
        }else {
            System.out.println("Product Unvailable");
        }
    }

    @Override
    public void addStock(int quantity) {
        this.quantity+=quantity;
    }

    @Override
    public void removeFromStock(int quantity) {
        if(this.quantity >= quantity){
            this.quantity-=quantity;
        }else{
            System.out.println("Product Unvailable");
        }
    }

    @Override
    public int getStockQuantity() {
        return quantity;
    }




}
