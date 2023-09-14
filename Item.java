public class Item {
    private String name;
    private double price;
    private boolean inStock;

    public Item(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        inStock = true;
    }


    public String getName() {
        return name;
    }

 
    public double getPrice() {
        return price;
    }


    public boolean isInStock() {
        return inStock;
    }

    public void soldOut() {
        inStock = false;
    }

    public void restock() {
        inStock = true;
    }

    public String toString() {
        return "Item Name: " + getName() + " Price: $" + getPrice() + " In Stock: " + isInStock();
    }
}
