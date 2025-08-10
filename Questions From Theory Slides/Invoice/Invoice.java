public class Invoice {
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0) {

            this.quantity = 0;
        }
        else this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        
        if (price < 0) {

            this.price = 0;
        }
        else this.price = price;
    }

    double getInvoiceAmount() {

        return this.quantity * this.price;
    }
}
