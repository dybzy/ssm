package com.dyb.service.impl

import com.dyb.dao.UserDao
import com.dyb.model.User
import com.dyb.service.UserService
import org.springframework.stereotype.Service

import javax.annotation.Resource

/**
 * @author dyb
 * @date 2019-12-31 17:19
 */
@Service
class UserServiceImpl : UserService {
    @Resource
    private val userDao: UserDao? = null

    override fun getUserById(userId: Int): User {


        return this.userDao!!.selectByPrimaryKey(userId)

    }
}
