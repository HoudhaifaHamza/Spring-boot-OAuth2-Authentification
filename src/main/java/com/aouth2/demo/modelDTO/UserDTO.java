package com.aouth2.demo.modelDTO;

import com.aouth2.demo.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String username;
    private String email;
    private String password;
    //    private Set<RoleDTO> roles = new HashSet<RoleDTO>();
    private Set<RoleDTO> roles = new HashSet<RoleDTO>();

}
