package edu.ucalgary.oop;

public class Supply {
    private String type;
    private int quantity;

    // Constructor
    Supply(String type, int quantity) {
        this.setType(type);
        this.setQuantity(quantity);
    }

    // type Methods
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // quantity Methods

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
