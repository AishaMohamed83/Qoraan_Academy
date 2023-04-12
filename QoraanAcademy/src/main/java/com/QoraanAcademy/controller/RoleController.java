package com.QoraanAcademy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Component
public class RoleController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        Map<String, Object> user = mongoTemplate.findOne(
                new Query(Criteria.where("email").is(email)), Map.class, "users");

        if (user == null) {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }

        String storedPasswordHash = (String) user.get("passwordHash");
        if (!new BCryptPasswordEncoder().matches(password, storedPasswordHash)) {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }

        String role = (String) user.get("role");
        if (role.equalsIgnoreCase("admin")) {
            return "admin-dashboard";
        } else if (role.equalsIgnoreCase("teacher")) {
            return "teacher-dashboard";
        } else if (role.equalsIgnoreCase("student")) {
            return "student-dashboard";
        } else {
            model.addAttribute("error", "Invalid user role");
            return "login";
        }
    }
}