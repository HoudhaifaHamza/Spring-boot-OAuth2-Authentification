package com.aouth2.demo.service;

import com.aouth2.demo.model.User;
import com.aouth2.demo.modelDTO.RoleDTO;
import com.aouth2.demo.modelDTO.UserDTO;

import java.util.List;
import java.util.Set;

public interface RoleService {

    Set<RoleDTO> createListRole(Set<RoleDTO> roleDTOs, User user);

    RoleDTO create(RoleDTO roleDTO, User user);
}
