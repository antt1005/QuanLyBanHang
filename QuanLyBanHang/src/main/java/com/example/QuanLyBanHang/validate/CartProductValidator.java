package com.example.QuanLyBanHang.validate;

import com.example.QuanLyBanHang.exceptions.BusinessException;
import com.example.QuanLyBanHang.exceptions.CartProductCode;
import com.example.QuanLyBanHang.request.CartProductSaveRequest;
import org.springframework.stereotype.Component;

@Component
public class CartProductValidator {
    public void validateCartProductSaveRequest(CartProductSaveRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(CartProductCode.CART_PRODUCT_SAVE_NULL))
                .requireNonDefaultInteger(CartProductSaveRequest::getIdCart, () -> new BusinessException(CartProductCode.CART_PRODUCT_ID_CART_BLANK))
                .requireNonDefaultInteger(CartProductSaveRequest::getIdProduct, () -> new BusinessException(CartProductCode.CART_PRODUCT_ID_PRODUCT_BLANK))
                .requireNonDefaultInteger(CartProductSaveRequest::getQuantity, () -> new BusinessException(CartProductCode.CART_PRODUCT_QUANTITY_BLANK))
                .requireNonDefaultInteger(CartProductSaveRequest::getDiscount, () -> new BusinessException(CartProductCode.CART_PRODUCT_DISCOUNT_BLANK))
                .requireNonDefaultInteger(CartProductSaveRequest::getTotalMoney, () -> new BusinessException(CartProductCode.CART_PRODUCT_TOTAL_MONEY_BLANK))
                .requireNonDefaultInteger(CartProductSaveRequest::getStatus,() -> new BusinessException(CartProductCode.CART_PRODUCT_STATUS_BLANK))
                
                .validate(CartProductSaveRequest::getQuantity, quantity -> quantity > 1000, () -> new BusinessException(CartProductCode.CART_PRODUCT_QUANTITY_MAX_VALUE))
                .validate(CartProductSaveRequest::getDiscount, discount ->  discount > 100, () -> new BusinessException(CartProductCode.CART_PRODUCT_DISCOUNT_MAX_VALUE))
                .validate(CartProductSaveRequest::getTotalMoney, totalmoney ->totalmoney > 1000000000, () -> new BusinessException(CartProductCode.CART_PRODUCT_TOTAL_MONEY_MAX_VALUE))
                .validate(CartProductSaveRequest::getStatus, status -> status > 2, () -> new BusinessException(CartProductCode.CART_PRODUCT_STATUS_MAX_VALUE))
                .get();
    }
}
