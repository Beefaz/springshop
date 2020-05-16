package sample.springshop.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "product_id")
    int productId;
    @Column (name = "user_id")
    int userId;
    @Column (name = "phone")
    String phone;
    @Column (name = "city")
    String city;
    @Column (name = "product_name")
    String productName;
    @Column (name = "product_price")
    double productPrice;
    @Column (name = "product_category")
    String productCategory;
    @Column (name = "delivery_method")
    String deliveryMethod;
    @Column (name = "advertisement_length")
    int advertisementLength;
    @Column (name = "advertisement_timestamp")
    String advertisementTimestamp;

    //get
    public Products(int productId, int userId, String phone, String city, String productName, double productPrice, String productCategory, String deliveryMethod, int advertisementLength, String advertisementTimestamp) {
        this.productId = productId;
        this.userId = userId;
        this.phone = phone;
        this.city = city;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.deliveryMethod = deliveryMethod;
        this.advertisementLength = advertisementLength;
        this.advertisementTimestamp = advertisementTimestamp;
    }

    //set
    public Products(int userId, String phone, String city, String productName, double productPrice, String productCategory, String deliveryMethod, int advertisementLength) {
        this.userId = userId;
        this.phone = phone;
        this.city = city;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.deliveryMethod = deliveryMethod;
        this.advertisementLength = advertisementLength;
    }

    //needed as default constructor
    public Products() {
    }

    public int getProductId() {
        return productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getAdvertisementTimestamp() {
        return advertisementTimestamp;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", userId=" + userId +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory='" + productCategory + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                ", advertisementLength=" + advertisementLength +
                ", advertisementTimestamp='" + advertisementTimestamp + '\'' +
                '}';
    }
}
