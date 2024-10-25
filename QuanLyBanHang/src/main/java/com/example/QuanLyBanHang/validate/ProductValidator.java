package com.example.QuanLyBanHang.validate;

import com.example.QuanLyBanHang.exceptions.BusinessException;
import com.example.QuanLyBanHang.exceptions.ProductCode;
import com.example.QuanLyBanHang.request.ProductSaveRequest;
import org.springframework.stereotype.Component;

@Component
public class ProductValidator {

    public void validateProductSaveRequest(ProductSaveRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(ProductCode.PRODUCT_SAVE_NULL))
                .requireNonBlank(ProductSaveRequest::getName, () -> new BusinessException(ProductCode.PRODUCT_NAME_BLANK))
                .requireNonDefaultInteger(ProductSaveRequest::getPrice, () -> new BusinessException(ProductCode.PRODUCT_PRICE_BLANK))
                .requireNonBlank(ProductSaveRequest::getDescribe, () -> new BusinessException(ProductCode.PRODUCT_DESCRIBE_BLANK))
                .requireNonDefaultInteger(ProductSaveRequest::getQuantity, () -> new BusinessException(ProductCode.PRODUCT_QUANTITY_BLANK))
                .requireNonDefaultInteger(ProductSaveRequest::getStatus, () -> new BusinessException(ProductCode.PRODUCT_STATUS_BLANK))

                .validate(ProductSaveRequest::getName, name -> name.length() > 255, () -> new BusinessException(ProductCode.PRODUCT_NAME_BLANK))
                .validate(ProductSaveRequest::getPrice, price -> price >1000000000, () -> new BusinessException(ProductCode.PRODUCT_PRICE_MAX_VALUE))
                .validate(ProductSaveRequest::getDescribe, describe -> describe.length() > 255, () -> new BusinessException(ProductCode.PRODUCT_DESCRIBE_MAX_LENGTH))
                .validate(ProductSaveRequest::getQuantity, quantity -> quantity > 1000, () -> new BusinessException(ProductCode.PRODUCT_QUANTITY_MAX_VALUE))
                .validate(ProductSaveRequest::getStatus, status -> status > 2, () -> new BusinessException(ProductCode.PRODUCT_STATUS_MAX_VALUE))
                .get();
    }
    
}
