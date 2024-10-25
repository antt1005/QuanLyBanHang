package com.example.QuanLyBanHang.exceptions;

import org.springframework.http.HttpStatus;

public class UserCode {
    public static final ResponseStatus USER_SAVE_NULL =
            new ResponseStatus("USER_SAVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_USERNAME_BLANK =
            new ResponseStatus("USER_USERNAME_BLANK", "Username is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_PASSWORD_BLANK =
            new ResponseStatus("USER_PASSWORD_BLANK", "Password is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_EMAIL_BLANK =
            new ResponseStatus("USER_EMAIL_BLANK", "Email is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_ADDRESS_BLANK =
            new ResponseStatus("USER_ADDRESS_BLANK", "Address is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_PHONE_NUMBER_BLANK =
            new ResponseStatus("USER_PHONE_NUMBER_BLANK", "Phone Number is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_STATUS_BLANK =
            new ResponseStatus("USER_STATUS_BLANK", "Status is blank", HttpStatus.BAD_REQUEST);

    public static final ResponseStatus USER_USERNAME_MAX_LENGTH =
            new ResponseStatus("USER_USERNAME_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_PASSWORD_MAX_LENGTH =
            new ResponseStatus("USER_PASSWORD_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_EMAIL_MAX_LENGTH =
            new ResponseStatus("USER_EMAIL_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_ADDRESS_MAX_LENGTH =
            new ResponseStatus("USER_ADDRESS_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_PHONE_NUMBER_MAX_LENGTH =
            new ResponseStatus("USER_PHONE_NUMBER_MAX_LENGTH", "Max length is 10", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus USER_STATUS_MAX_VALUE =
            new ResponseStatus("USER_STATUS_MAX_VALUE", "Max value is 2", HttpStatus.BAD_REQUEST);

    private UserCode() {

    }
}
