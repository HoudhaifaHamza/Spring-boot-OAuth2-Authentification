package com.aouth2.demo.service;

import com.aouth2.demo.modelDTO.UserDTO;

public interface UserService {
    /**
     * save User
     *
     * @param userDTO
     * @return User
     */
    UserDTO saveUser(UserDTO userDTO);

    String deleteUser(Integer id);

}
