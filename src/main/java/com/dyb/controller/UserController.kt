package com.dyb.controller

import com.dyb.model.User
import com.dyb.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

import javax.annotation.Resource
import org.springframework.ui.Model
import javax.servlet.http.HttpServletRequest

/**
 * @author dyb
 * @date 2019-12-31 17:22
 */

@Controller
@RequestMapping("/user")
class UserController {
    @Resource
    private val userService: UserService? = null

    @RequestMapping("/showUser")
    fun toIndex(request: HttpServletRequest, model: Model): String {
        val userId = Integer.parseInt(request.getParameter("id"))
        val user = this.userService!!.getUserById(userId)
        model.addAttribute("user", user)
        return "showUser"
    }
}
