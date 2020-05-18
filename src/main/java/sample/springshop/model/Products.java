package sample.springshop.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "product_id")
    private int productId;
    @Column (name = "product_name")
    private String productName;
    @Column (name = "product_price")
    private double productPrice;
    @Column (name = "product_category")
    private String productCategory;
    @Column (name = "delivery_method")
    private String deliveryMethod;
    @Column (name = "advertisement_length")
    private int advertisementLength;
    @Column (name = "phone")
    private String phone;
    @Column (name = "city")
    private String city;

    //get
    public Products(int productId, String productName, double productPrice, String productCategory, String deliveryMethod, int advertisementLength, String phone, String city) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.deliveryMethod = deliveryMethod;
        this.advertisementLength = advertisementLength;
        this.phone = phone;
        this.city = city;
    }

    //set
    public Products(String productName, double productPrice, String productCategory, String deliveryMethod, int advertisementLength, String phone, String city) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.deliveryMethod = deliveryMethod;
        this.advertisementLength = advertisementLength;
        this.phone = phone;
        this.city = city;
    }

    //needed as default constructor
    public Products() {
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public int getAdvertisementLength() {
        return advertisementLength;
    }

    public void setAdvertisementLength(int advertisementLength) {
        this.advertisementLength = advertisementLength;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory='" + productCategory + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                ", advertisementLength=" + advertisementLength +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
