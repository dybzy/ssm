package com.dyb.service

import com.dyb.model.User

/**
 * @author dyb
 * @date 2019-12-31 17:16
 */
interface UserService {
    fun getUserById(userId: Int): User
}
