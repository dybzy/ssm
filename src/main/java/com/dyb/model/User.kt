package com.dyb.model

import lombok.Data

import java.io.Serializable

/**
 * @author dyb
 * @date 2019-12-31 17:17
 */
@Data
class User : Serializable {
    var id: Int = 0
        set(id) {
            field = this.id
        }
    var userName: String? = null
        set(userName) {
            field = this.userName
        }
    var password: String? = null
        set(password) {
            field = this.password
        }
    var age: Int = 0
        set(age) {
            field = this.age
        }

}
