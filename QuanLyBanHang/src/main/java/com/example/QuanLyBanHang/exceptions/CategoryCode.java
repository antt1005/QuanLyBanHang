package com.example.QuanLyBanHang.exceptions;

import org.springframework.http.HttpStatus;

public class CategoryCode {

    public static final ResponseStatus CATEGORY_SAVE_NULL =
            new ResponseStatus("CATEGORY_SAVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_NAME_BLANK =
            new ResponseStatus("CATEGORY_NAME_BLANK", "Name is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_DESCRIBE_BLANK =
            new ResponseStatus("CATEGORY_DESCRIBE_BLANK", "Describe is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_REVIEWS_BLANK =
            new ResponseStatus("CATEGORY_REVIEWS_BLANK", "Reviews is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_TIME_CREATED_BLANK =
            new ResponseStatus("CATEGORY_TIME_CREATED_BLANK", "Time Created is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_TIME_UPDATED_BLANK =
            new ResponseStatus("CATEGORY_TIME_UPDATED_BLANK", "Time Updated is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_STATUS_BLANK =
            new ResponseStatus("CATEGORY_STATUS_BLANK", "Status is blank", HttpStatus.BAD_REQUEST);

    public static final ResponseStatus CATEGORY_NAME_MAX_LENGTH =
            new ResponseStatus("CATEGORY_NAME_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_DESCRIBE_MAX_LENGTH =
            new ResponseStatus("CATEGORY_DESCRIBE_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_REVIEWS_MAX_LENGTH =
            new ResponseStatus("CATEGORY_REVIEWS_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_TIME_CREATED_MAX_VALUE =
            new ResponseStatus("CATEGORY_TIME_CREATED_MAX_VALUE", "Max value is 24", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_TIME_UPDATED_MAX_VALUE =
            new ResponseStatus("CATEGORY_TIME_UPDATED_MAX_VALUE", "Max value is 24", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus CATEGORY_STATUS_MAX_VALUE =
            new ResponseStatus("CATEGORY_STATUS_MAX_VALUE", "Max value is 2", HttpStatus.BAD_REQUEST);

    public CategoryCode() {
    }
}
