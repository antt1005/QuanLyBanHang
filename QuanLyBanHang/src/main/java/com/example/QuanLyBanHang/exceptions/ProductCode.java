package com.example.QuanLyBanHang.exceptions;

import org.springframework.http.HttpStatus;

public class ProductCode {
    public static final ResponseStatus PRODUCT_SAVE_NULL =
            new ResponseStatus("PRODUCT_SAVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus PRODUCT_NAME_BLANK =
            new ResponseStatus("PRODUCT_NAME_BLANK", "Name is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus PRODUCT_PRICE_BLANK =
            new ResponseStatus("PRODUCT_PRICE_BLANK", "Price is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus PRODUCT_DESCRIBE_BLANK =
            new ResponseStatus("PRODUCT_DESCRIBE_BLANK", "Describe is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus PRODUCT_QUANTITY_BLANK =
            new ResponseStatus("PRODUCT_QUANTITY_BLANK", "Quantity is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus PRODUCT_STATUS_BLANK =
            new ResponseStatus("PRODUCT_STATUS_BLANK", "Status is blank", HttpStatus.BAD_REQUEST);

    public static final ResponseStatus PRODUCT_NAME_MAX_LENGTH =
            new ResponseStatus("PRODUCT_NAME_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus PRODUCT_PRICE_MAX_VALUE =
            new ResponseStatus("PRODUCT_PRICE_MAX_VALUE", "Max value is 1000000000", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus PRODUCT_DESCRIBE_MAX_LENGTH =
            new ResponseStatus("PRODUCT_DESCRIBE_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus PRODUCT_QUANTITY_MAX_VALUE =
            new ResponseStatus("PRODUCT_QUANTITY_MAX_VALUE", "Max value is 1000", HttpStatus.BAD_REQUEST);

    public static final ResponseStatus PRODUCT_STATUS_MAX_VALUE =
            new ResponseStatus("PRODUCT_STATUS_MAX_VALUE", "Max value is 2", HttpStatus.BAD_REQUEST);

    public ProductCode() {
    }
}
