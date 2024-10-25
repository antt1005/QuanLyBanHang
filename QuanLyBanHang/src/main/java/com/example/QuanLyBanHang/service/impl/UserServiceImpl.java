package com.example.QuanLyBanHang.service.impl;

import com.example.QuanLyBanHang.model.Cart;
import com.example.QuanLyBanHang.model.Users;
import com.example.QuanLyBanHang.repository.UserRepo;
import com.example.QuanLyBanHang.response.UserResponse;
import com.example.QuanLyBanHang.service.UserService;
import com.example.QuanLyBanHang.request.UserSaveRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserSaveRequest cread(UserSaveRequest usersave) {

        Users users = new Users(usersave.getUserName(),usersave.getPassWord(),
                usersave.getEmail(),usersave.getAddress(),
                usersave.getPhoneNumber(),usersave.getStatus());
         repo.save(users);
         return usersave;
    }

    @Override
    public Users findId(Integer id) {
        return repo.getUsersById(id);
    }

    @Override
    public List<Users> getAll() {
        return repo.findAll();
    }

    @Override
    public Users update(Integer id, UserSaveRequest userupdate) {

        Users users =repo.findById(id).orElse(null);
        if(users != null){

            users.setUserName(userupdate.getUserName());
            users.setPassWord(userupdate.getPassWord());
            users.setEmail(userupdate.getEmail());
            users.setAddress(userupdate.getAddress());
            users.setPhoneNumber(userupdate.getPhoneNumber());
            users.setStatus(userupdate.getStatus());
         return repo.save(users);
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        Users userdelete = repo.findById(id).orElse(null);
        if(userdelete != null){
             repo.delete(userdelete);
             return true;
        }
        return false;
    }
}
