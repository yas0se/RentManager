package com.gestion.g1.controllers;

import com.gestion.g1.models.User;
import com.gestion.g1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // Affiche le JSP register.jsp
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam("username") String username,
                               @RequestParam("email") String email,
                               @RequestParam("password") String password,
                               Model model) {

        if (userRepository.findByUsername(username).isPresent()) {
            model.addAttribute("messageJsp", "Username already exists.");
            return "register";
        }

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        userRepository.save(user);

        model.addAttribute("messageJsp", "Successfully registered! You can login now.");
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // JSP login.jsp
    }
}
