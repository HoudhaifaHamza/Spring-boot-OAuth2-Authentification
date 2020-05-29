package com.aouth2.demo.serviceImpl;

import com.aouth2.demo.model.Role;
import com.aouth2.demo.model.User;
import com.aouth2.demo.modelDTO.RoleDTO;
import com.aouth2.demo.modelDTO.UserDTO;
import com.aouth2.demo.repository.RoleRepository;
import com.aouth2.demo.service.RoleService;
import com.aouth2.demo.utils.ValidationUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private DozerBeanMapper mapper;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    @Transactional()
    public Set<RoleDTO> createListRole(Set<RoleDTO> roleDTOs, User user) {
        Set<RoleDTO> createdRoleDTOs = new HashSet<>();
        if (!ValidationUtils.isNullOrEmpty(roleDTOs)) {
            roleDTOs.forEach(roleDTO -> {
                RoleDTO role = create(roleDTO, user);
                createdRoleDTOs.add(role);
            });
        }

        return createdRoleDTOs;
    }

    @Override
    @Transactional()
    public RoleDTO create(RoleDTO roleDTO, User user) {
        RoleDTO createdRoleDTO;
        Role role = mapper.map(roleDTO, Role.class);
        if (roleDTO.getId() == null) {
            role.setName(roleDTO.getName());
            role.setUser(user);
            role = roleRepository.save(role);
        } else {
            update(roleDTO, user);
        }
        createdRoleDTO = mapper.map(role, RoleDTO.class);
        return createdRoleDTO;

    }

    public RoleDTO update(RoleDTO roleDTO, User user) {
        return roleDTO;
        /**
         * à completer
         */
    }
}
