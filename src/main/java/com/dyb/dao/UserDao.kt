package com.dyb.dao

import com.dyb.model.User

/**
 * @author dyb
 * @date 2019-12-31 17:20
 */
interface UserDao {
    fun selectByPrimaryKey(userId: Int): User
}
