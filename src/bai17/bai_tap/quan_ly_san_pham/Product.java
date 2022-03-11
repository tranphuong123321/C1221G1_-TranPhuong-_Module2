package bai17.bai_tap.quan_ly_san_pham;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String productName;
    private String manufacturer;
    private int cost;
    private String otherDescriptions;

    public Product() {
    }

    public Product(int idProduct, String productName, String manufacturer, int cost, String otherDescriptions) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.otherDescriptions = otherDescriptions;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOtherDescriptions() {
        return otherDescriptions;
    }

    public void setOtherDescriptions(String otherDescriptions) {
        this.otherDescriptions = otherDescriptions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", cost=" + cost +
                ", otherDescriptions='" + otherDescriptions + '\'' +
                '}';
    }
}
