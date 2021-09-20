package org.yastech.am_golampoor_ums.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView
import org.yastech.am_golampoor_ums.service.UserService

@Controller
class MainController
(
    private var userService: UserService
)
{
    @GetMapping("/")
    fun homePage(@RequestParam name: String?, model: Model): String
    {
        model.addAttribute("name", name)
        return "index"
    }

    @GetMapping("/about")
    fun aboutPage(@RequestParam name: String?, model: Model): String
    {
        model.addAttribute("ali", name)
        return "about"
    }

    @GetMapping("/contact")
    fun contactPage(): String
    {
        userService.add()
        return "contact"
    }
}