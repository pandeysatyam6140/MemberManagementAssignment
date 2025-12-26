package com.surest.membermanagementassignment.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println("Admin password hash: " + passwordEncoder.encode("admin123"));
        System.out.println("User password hash: " + passwordEncoder.encode("user123"));
    }
}
