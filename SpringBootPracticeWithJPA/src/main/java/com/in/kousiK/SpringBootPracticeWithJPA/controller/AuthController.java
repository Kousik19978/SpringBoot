package com.in.kousiK.SpringBootPracticeWithJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.in.kousiK.SpringBootPracticeWithJPA.SecurityConfiguration.JwtUtil;

//import com.in.kousiK.SpringBootPracticeWithJPA.SecurityConfiguration.JwtUtil;
//import com.in.kousiK.SpringBootPracticeWithJPA.dao.UserRepository;
//import com.in.kousiK.SpringBootPracticeWithJPA.entity.AuthRequest;
//import com.in.kousiK.SpringBootPracticeWithJPA.entity.AuthResponse;
//import com.in.kousiK.SpringBootPracticeWithJPA.entity.User;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest request) {

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole("ROLE_USER");

        userRepository.save(user);

        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        String token = jwtUtil.generateToken(request.getUsername());

        return new AuthResponse(token);
    }

    @GetMapping("/secure")
    public String secure() {
        return "JWT Secured API Working!";
    }
}
