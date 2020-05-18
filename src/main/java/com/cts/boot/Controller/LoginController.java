package com.cts.boot.Controller;

import com.cts.boot.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping(value = "/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String showHomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
        boolean isUserValid = loginService.validateUser(name, password);
        if (!isUserValid) {
            model.put("errorMsg", "Invalid Credentials");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        return "home";
    }
}