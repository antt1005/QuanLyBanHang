package com.example.QuanLyBanHang.validate;

import com.example.QuanLyBanHang.exceptions.BusinessException;
import com.example.QuanLyBanHang.exceptions.CategoryCode;
import com.example.QuanLyBanHang.request.CategorySaveRequest;
import org.springframework.stereotype.Component;

@Component
public class CategoryValidator {

    public void validateCategorySaveRequest(CategorySaveRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(CategoryCode.CATEGORY_SAVE_NULL))
                .requireNonBlank(CategorySaveRequest::getName, () -> new BusinessException(CategoryCode.CATEGORY_NAME_BLANK))
                .requireNonBlank(CategorySaveRequest::getDescribe, () -> new BusinessException(CategoryCode.CATEGORY_DESCRIBE_BLANK))
                .requireNonBlank(CategorySaveRequest::getReviews, () -> new BusinessException(CategoryCode.CATEGORY_REVIEWS_BLANK))
                .requireNonDefaultInteger(CategorySaveRequest::getTimeCreated, () -> new BusinessException(CategoryCode.CATEGORY_TIME_CREATED_BLANK))
                .requireNonDefaultInteger(CategorySaveRequest::getTimeUpdated, () -> new BusinessException(CategoryCode.CATEGORY_TIME_UPDATED_BLANK))
                .requireNonDefaultInteger(CategorySaveRequest::getStatus,() -> new BusinessException(CategoryCode.CATEGORY_STATUS_BLANK))

                .validate(CategorySaveRequest::getName, name -> name.length() > 255, () -> new BusinessException(CategoryCode.CATEGORY_NAME_BLANK))
                .validate(CategorySaveRequest::getDescribe, describe -> describe.length() > 255, () -> new BusinessException(CategoryCode.CATEGORY_DESCRIBE_MAX_LENGTH))
                .validate(CategorySaveRequest::getReviews, reviews -> reviews.length() > 255, () -> new BusinessException(CategoryCode.CATEGORY_REVIEWS_MAX_LENGTH))
                .validate(CategorySaveRequest::getTimeCreated, timecreated -> timecreated > 24, () -> new BusinessException(CategoryCode.CATEGORY_TIME_CREATED_MAX_VALUE))
                .validate(CategorySaveRequest::getTimeUpdated, timeupdate ->  timeupdate > 24, () -> new BusinessException(CategoryCode.CATEGORY_TIME_UPDATED_MAX_VALUE))
                .validate(CategorySaveRequest::getStatus, status -> status > 2, () -> new BusinessException(CategoryCode.CATEGORY_STATUS_MAX_VALUE))
                .get();
    }
}
