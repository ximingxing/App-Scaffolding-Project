package com.ximingxing.blog.security.entity;

import lombok.Data;


/**
 * Description: Login User Entity
 * Created By xxm
 */
@Data
public class LoginUser {

    private String username;
    private String password;
    private Boolean rememberMe;
}
