package com.zzc.controller;

import com.zzc.service.UserService;
import com.zzc.tk.model.TBUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public String loginPost(TBUser user, Model model, HttpSession httpSession) {
        TBUser user1 = userService.selectByNameAndPwd(user);
        if (user1 != null) {
            httpSession.setAttribute("user", user1);
            TBUser name = (TBUser) httpSession.getAttribute("user");
            return "redirect:/main.html";
        } else {
            model.addAttribute("error", "用户名或密码错误，请重新登录！");
            return "/login";
        }
    }
}
