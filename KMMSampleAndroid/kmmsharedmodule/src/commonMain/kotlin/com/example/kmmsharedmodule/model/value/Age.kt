package com.example.kmmsharedmodule.model.value

data class Age(val value: Int) {
   init {
       if (value < 0 || 120 < value) {
           throw IllegalArgumentException("不正な値です")
       }
   }

}