package ru.jskills.git;

public enum Model {
    Tahoe(34000), C63AMG(76000), M3, RS4(77000);

    private int price;

    public int getPrice() {
        return price;
    }

    Model(int price) {
        this.price = price;
    }

    Model() {
        this.price = -1; // price not set
    }
}
