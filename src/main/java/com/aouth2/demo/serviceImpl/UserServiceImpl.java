package com.aouth2.demo.serviceImpl;

import com.aouth2.demo.model.User;
import com.aouth2.demo.modelDTO.RoleDTO;
import com.aouth2.demo.modelDTO.UserDTO;
import com.aouth2.demo.repository.UserRepository;
import com.aouth2.demo.service.RoleService;
import com.aouth2.demo.utils.ValidationUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.aouth2.demo.service.UserService;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private DozerBeanMapper mapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleService roleService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    @Transactional()
    public UserDTO saveUser(UserDTO userDTO) {
            UserDTO createdUserDTO = new UserDTO();
        if (userDTO.getId() == null) {
            userDTO.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
            User user = mapper.map(userDTO, User.class);
            userRepository.save(user);
            System.out.println("houdhaifa");
            createdUserDTO = mapper.map(user, UserDTO.class);
        }
       else {
           throw new RuntimeException("user already exist");
        }

       if(!ValidationUtils.isNullOrEmpty(userDTO.getRoles())) {
           Set<RoleDTO> roleDTOs = roleService.createListRole(userDTO.getRoles(), mapper.map(createdUserDTO, User.class));
           createdUserDTO.setRoles(roleDTOs);
       }
        return createdUserDTO;
    }


    @Override
    public String deleteUser(Integer id) {
        userRepository.deleteById(id);
        return  "user removed with Id " + id;

    }
}
