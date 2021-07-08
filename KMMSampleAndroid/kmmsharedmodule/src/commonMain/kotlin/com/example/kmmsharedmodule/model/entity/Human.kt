package com.example.kmmsharedmodule.model.entity

import com.example.kmmsharedmodule.model.value.Age
import com.example.kmmsharedmodule.model.value.Gender

/**
 * 人間定義
 */
data class Human (

    /**
     * 性別
     */
    val gender: Gender,

    /**
     * 年齢
     */
    var age: Age
)