package sample.springshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @Column (name = "product_id")
    int productId;
    @Column (name = "user_id")
    int userId;
    @Column (name = "phone")
    String phone;
    @Column (name = "city")
    String city;
    @Column (name = "product_name")
    String product_name;
    @Column (name = "product_price")
    double product_price;
    @Column (name = "product_category")
    String product_category;
    @Column (name = "delivery_method")
    String delivery_method;
    @Column (name = "advertisement_length")
    int advertisement_length;
    @Column (name = "advertisement_timestamp")
    String advertisement_timestamp;

    public Products(int productId, int userId, String phone, String city, String product_name, double product_price, String product_category, String delivery_method, int advertisement_length, String advertisement_timestamp) {
        this.productId = productId;
        this.userId = userId;
        this.phone = phone;
        this.city = city;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_category = product_category;
        this.delivery_method = delivery_method;
        this.advertisement_length = advertisement_length;
        this.advertisement_timestamp = advertisement_timestamp;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getDelivery_method() {
        return delivery_method;
    }

    public void setDelivery_method(String delivery_method) {
        this.delivery_method = delivery_method;
    }

    public int getAdvertisement_length() {
        return advertisement_length;
    }

    public void setAdvertisement_length(int advertisement_length) {
        this.advertisement_length = advertisement_length;
    }

    public String getAdvertisement_timestamp() {
        return advertisement_timestamp;
    }

    public void setAdvertisement_timestamp(String advertisement_timestamp) {
        this.advertisement_timestamp = advertisement_timestamp;
    }

    @Override
    public String toString() {
        return "Products[" +
                "productId=" + productId +
                ", userId=" + userId +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_category='" + product_category + '\'' +
                ", delivery_method='" + delivery_method + '\'' +
                ", advertisement_length=" + advertisement_length +
                ", advertisement_timestamp='" + advertisement_timestamp + '\'' +
                ']';
    }
}
