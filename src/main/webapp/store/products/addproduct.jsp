<%@ page contentType="text/html;charset=UTF-8" %>

<form action="products/addproduct">
    <div class="jumbotron d-flex">
        <div class="d-flex flex-row" style="margin-right:20px">
            <button type="submit" class="btn btn-info">Create</button>
        </div>
        <div class="d-flex flex-row flex-wrap justify-content-start" style="flex-grow:1">
            <div class="d-flex flex-column" style="margin-right:10px">
                <label for="product_name">Item name</label><input type="text" id="product_name"
                                                                           name="productName">
            </div>
            <div class="d-flex flex-column "style="margin-right:10px">
                <label for="product_price">Item price</label><input type="text" id="product_price"
                                                                      name="productPrice">
            </div>
            <div class="d-flex flex-column "style="margin-right:10px">
                <label for="product_category">Item category</label><input type="text" id="product_category"
                                                                              name="productCategory">
            </div>
            <div class="d-flex flex-column "style="margin-right:10px">
                <label for="delivery_method">Delivery method</label><input type="text" id="delivery_method"
                                                                            name="deliveryMethod">
            </div>
            <div class="d-flex flex-column" style="margin-right:10px">
                <label for="advertisement_length">Advertisement length</label><input type="text" id="advertisement_length"
                                                                                name="advertisementLength">
            </div>
            <div class="d-flex flex-column" style="margin-right:10px">
                <label for="phone">Phone</label><input type="text" id="phone" name="phone">
            </div>
            <div class="d-flex flex-column" style="margin-right:10px">
                <label for="city">City</label><input type="text" id="city" name="city">
            </div>
        </div>
    </div>
</form>
<br>
