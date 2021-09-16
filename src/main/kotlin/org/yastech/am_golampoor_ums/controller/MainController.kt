package org.yastech.am_golampoor_ums.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController
{
    @GetMapping("/")
    fun homePage(): String
    {
        return "index"
    }

    @GetMapping("/about")
    fun aboutPage(): String
    {
        return "about"
    }

    @GetMapping("/contact")
    fun contactPage(): String
    {
        return "contact"
    }
}