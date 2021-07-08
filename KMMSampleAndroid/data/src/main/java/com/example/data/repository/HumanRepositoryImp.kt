package com.example.data.repository

import com.example.kmmsharedmodule.model.entity.Human
import com.example.kmmsharedmodule.model.value.Age
import com.example.kmmsharedmodule.model.value.Gender
import com.example.kmmsharedmodule.repository.LocalHumanRepository

class HumanRepositoryImp: LocalHumanRepository {
    override fun saveHuman(human: Human) {

    }

    override fun getHumanFirst(): Human {
       return Human(Gender.MAN, Age(5))
    }
}