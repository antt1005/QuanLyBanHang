package com.example.QuanLyBanHang.validate;

import com.example.QuanLyBanHang.exceptions.BusinessException;
import com.example.QuanLyBanHang.exceptions.UserCode;
import com.example.QuanLyBanHang.request.UserSaveRequest;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {

    public void validateUserSaveRequest(UserSaveRequest request) {
        Validator.of(request)
                .requireNonNull(() -> new BusinessException(UserCode.USER_SAVE_NULL))
                .requireNonBlank(UserSaveRequest::getUserName, () -> new BusinessException(UserCode.USER_USERNAME_BLANK))
                .requireNonBlank(UserSaveRequest::getPassWord, () -> new BusinessException(UserCode.USER_PASSWORD_BLANK))
                .requireNonBlank(UserSaveRequest::getEmail, () -> new BusinessException(UserCode.USER_EMAIL_BLANK))
                .requireNonBlank(UserSaveRequest::getAddress, () -> new BusinessException(UserCode.USER_ADDRESS_BLANK))
                .requireNonBlank(UserSaveRequest::getPhoneNumber, () -> new BusinessException(UserCode.USER_PHONE_NUMBER_BLANK))
                .requireNonDefaultInteger(UserSaveRequest::getStatus,() -> new BusinessException(UserCode.USER_STATUS_BLANK))

                .validate(UserSaveRequest::getUserName, name -> name.length() > 255, () -> new BusinessException(UserCode.USER_USERNAME_BLANK))
                .validate(UserSaveRequest::getPassWord, password -> password.length() > 255, () -> new BusinessException(UserCode.USER_PASSWORD_MAX_LENGTH))
                .validate(UserSaveRequest::getEmail, email -> email.length() > 255, () -> new BusinessException(UserCode.USER_EMAIL_MAX_LENGTH))
                .validate(UserSaveRequest::getAddress, address -> address.length() > 255, () -> new BusinessException(UserCode.USER_ADDRESS_MAX_LENGTH))
                .validate(UserSaveRequest::getPhoneNumber, phone -> phone.length() > 10, () -> new BusinessException(UserCode.USER_PHONE_NUMBER_MAX_LENGTH))
                .validate(UserSaveRequest::getStatus, status -> status > 2, () -> new BusinessException(UserCode.USER_STATUS_MAX_VALUE))
                .get();
    }
}
