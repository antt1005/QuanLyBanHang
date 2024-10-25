package com.example.QuanLyBanHang.validate;

import com.example.QuanLyBanHang.exceptions.BusinessException;
import com.example.QuanLyBanHang.exceptions.CartCode;
import com.example.QuanLyBanHang.request.CartSaveRequest;
import org.springframework.stereotype.Component;

@Component
public class CartValidator {

    public void validateCartSaveRequest(CartSaveRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(CartCode.CART_SAVE_NULL))
                .requireNonBlank(CartSaveRequest::getName, () -> new BusinessException(CartCode.CART_NAME_BLANK))
                .requireNonBlank(CartSaveRequest::getNote, () -> new BusinessException(CartCode.CART_NOTE_BLANK))
                .requireNonDefaultInteger(CartSaveRequest::getTimecreated, () -> new BusinessException(CartCode.CART_TIME_CREATED_BLANK))
                .requireNonDefaultInteger(CartSaveRequest::getStatus,() -> new BusinessException(CartCode.CART_STATUS_BLANK))

                .validate(CartSaveRequest::getName, name -> name.length() > 255, () -> new BusinessException(CartCode.CART_NAME_BLANK))
                .validate(CartSaveRequest::getNote, describe -> describe.length() > 255, () -> new BusinessException(CartCode.CART_NOTE_MAX_LENGTH))
                .validate(CartSaveRequest::getTimecreated, timeupdate -> timeupdate> 24, () -> new BusinessException(CartCode.CART_TIME_CREATED_MAX_VALUE))
                .validate(CartSaveRequest::getStatus, status -> status> 2, () -> new BusinessException(CartCode.CART_STATUS_MAX_VALUE))
                .get();
    }
}
