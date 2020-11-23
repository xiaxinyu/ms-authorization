package com.test;

import com.sailfish.authorization.core.ChoerodonBcryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author XIAXINYU3
 * @date 2020/11/23
 */
public class PasswordTest2 {
    public static void main(String[] args) {
        ChoerodonBcryptPasswordEncoder encoder = new ChoerodonBcryptPasswordEncoder();
        String t = encoder.encode("choerodon");
        System.out.println(t);
        boolean result = encoder.matches("choerodon", t);
        System.out.println(result);
    }
}
