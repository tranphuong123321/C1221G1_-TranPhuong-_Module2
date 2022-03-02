package bai_12.bai_tap.luyen_tap_arlist_lklist;

import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {
    private int id;
    private String name;
    public double price;
    static int productid;


    public Product() {

    }

    public Product(String name, double price) {
        productid++;
        this.id = productid;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice()) {
            return 1;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.price > o2.getPrice()) {
            return -1;
        } else if (o1.price < o2.getPrice()) {
            return 1;
        } else {
            return 0;

        }

    }
}

