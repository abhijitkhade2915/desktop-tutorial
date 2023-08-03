package com.user.service.userService.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(name="name")
    private String userName;
    @Column(name="email")
    private String email;
    @Column(name="number")
    private String mobileNumber;

    @Transient
    private List<Rating> ratings= new ArrayList<>();

}
