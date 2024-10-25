package com.example.QuanLyBanHang.exceptions;

import org.springframework.http.HttpStatus;

public class CartCode {

    public static final ResponseStatus CART_SAVE_NULL =
            new ResponseStatus("CART_SAVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_NAME_BLANK =
            new ResponseStatus("CART_NAME_BLANK", "Name is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_NOTE_BLANK =
            new ResponseStatus("CART_NOTE_BLANK", "Note is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_TIME_CREATED_BLANK =
            new ResponseStatus("CART_TIME_CREATED_BLANK", "Time Created is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_STATUS_BLANK =
            new ResponseStatus("CART_STATUS_BLANK", "Status is blank", HttpStatus.BAD_REQUEST);

    public static final ResponseStatus CART_NAME_MAX_LENGTH =
            new ResponseStatus("CART_NAME_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_NOTE_MAX_LENGTH =
            new ResponseStatus("CART_NOTE_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_TIME_CREATED_MAX_VALUE =
            new ResponseStatus("CART_TIME_CREATED_MAX_VALUE", "Max value is 24", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CART_STATUS_MAX_VALUE =
            new ResponseStatus("CART_STATUS_MAX_VALUE", "Max value is 2", HttpStatus.BAD_REQUEST);

    public CartCode() {
    }
}
