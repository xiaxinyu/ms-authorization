package com.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author XIAXINYU3
 * @date 2020/11/23
 */
public class PasswordTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        boolean result = encoder.matches("summer", "$10$LfAHuQfPDUkdatk5kenlZuj2iGx5UEtnnKTpgG7lNBGYk1q./TEli");
        System.out.println(result);
    }
}
