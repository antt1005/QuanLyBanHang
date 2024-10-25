package com.example.QuanLyBanHang.exceptions;

import org.springframework.http.HttpStatus;

public class CartProductCode {

    public static final ResponseStatus CART_PRODUCT_SAVE_NULL =
            new ResponseStatus("CART_PRODUCT_SAVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_ID_CART_BLANK =
            new ResponseStatus("CART_PRODUCT_ID_CART_BLANK", "idCart is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_ID_PRODUCT_BLANK =
            new ResponseStatus("CART_PRODUCT_ID_PRODUCT_BLANK", "idProduct is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_QUANTITY_BLANK =
            new ResponseStatus("CART_PRODUCT_QUANTITY_BLANK", "Quantity is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_DISCOUNT_BLANK =
            new ResponseStatus("CART_PRODUCT_DISCOUNT_BLANK", "Discount is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_TOTAL_MONEY_BLANK =
            new ResponseStatus("CART_PRODUCT_TOTAL_MONEY_BLANK", "Total money is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_STATUS_BLANK =
            new ResponseStatus("CART_PRODUCT_STATUS_BLANK", "Status is blank", HttpStatus.BAD_REQUEST);

    public static final ResponseStatus CART_PRODUCT_QUANTITY_MAX_VALUE =
            new ResponseStatus("CART_PRODUCT_QUANTITY_MAX_VALUE", "Max VALUE is 1000", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_DISCOUNT_MAX_VALUE =
            new ResponseStatus("CART_PRODUCT_DISCOUNT_MAX_VALUE", "Max VALUE is 100", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_TOTAL_MONEY_MAX_VALUE =
            new ResponseStatus("CART_PRODUCT_TOTAL_MONEY_MAX_VALUE", "Max VALUE is 1000000000", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_PRODUCT_STATUS_MAX_VALUE =
            new ResponseStatus("CART_PRODUCT_STATUS_MAX_VALUE", "Max VALUE is 2", HttpStatus.BAD_REQUEST);

    public CartProductCode() {
    }
}
