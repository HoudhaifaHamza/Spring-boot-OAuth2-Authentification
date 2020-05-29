package com.aouth2.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString(exclude = "roles")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String email;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
//    @Column(name = "role_Id")
    private Set<Role> roles = new HashSet<>();


}
