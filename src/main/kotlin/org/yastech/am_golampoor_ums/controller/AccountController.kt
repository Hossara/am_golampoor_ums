package org.yastech.am_golampoor_ums.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class AccountController
{
    @GetMapping("/login")
    fun login(@RequestParam res: String?, model: Model): String
    {
        if (!res.isNullOrEmpty() && res == "err")
        {
            model.addAttribute("res", res)
        }
        return "login"
    }

    @PostMapping("/login")
    fun doLogin(@RequestParam username: String, @RequestParam password: String): String
    {
        return if(username == "Hosara84")
        {
            if (password == "123456")
            {
                "redirect:/dashboard"
            }
            else
            {
                "redirect:/login?res=err"
            }
        }
        else
        {
            "redirect:/login?res=err"
        }
    }

    @GetMapping("/dashboard")
    fun dashboard(): String
    {
        return "dashboard"
    }
}