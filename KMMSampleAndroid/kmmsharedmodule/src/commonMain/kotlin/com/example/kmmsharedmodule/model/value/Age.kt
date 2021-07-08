package com.example.kmmsharedmodule.model.value

data class Age(val value: Int) {
   init {
       if (0 < value || value < 120) {
           throw IllegalArgumentException("不正な値です")
       }
   }

}