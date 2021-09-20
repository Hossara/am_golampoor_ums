package org.yastech.am_golampoor_ums.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/products")
class ProductController
{
    val products = mapOf("prod1" to "Java Book", "prod2" to "Gormesabzi", "prod3" to "galaxy s20 ultra")

    @GetMapping("/single/{id}")
    fun singleProduct(@PathVariable id: String, model: Model): String
    {
        if (products.containsKey(id))
        {
            model.addAttribute("product", arrayOf(id, products[id]))
        }
        else
        {
            model.addAttribute("product", null)
        }
        return "single"
    }
}