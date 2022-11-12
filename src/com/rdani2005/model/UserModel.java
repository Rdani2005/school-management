package com.rdani2005.model;

import java.awt.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserModel {
    private int id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String type;
    private Image profile_image;
}
