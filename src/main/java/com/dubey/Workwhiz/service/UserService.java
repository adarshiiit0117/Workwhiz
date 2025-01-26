package com.dubey.Workwhiz.service;

import com.dubey.Workwhiz.modal.User;

public interface UserService {
    User findUserProfileByJwt(String jwt)throws Exception;
    User findUserByEmail(String email)throws Exception;
    User findUserById(Long userId)throws Exception;
    User updateUsersProjectSize(User user,int number);
}
