package com.example.kmmsharedmodule.usecase

import com.example.kmmsharedmodule.model.entity.Human
import com.example.kmmsharedmodule.model.value.Age
import com.example.kmmsharedmodule.model.value.Gender
import com.example.kmmsharedmodule.repository.LocalHumanRepository

/**
 * 人間に関するビジネスロジック
 */
class HumanUseCaseImp (private val localHumanRepository: LocalHumanRepository): HumanUseCase {

    // 赤ちゃん生成
    override fun bornHuman(): Human {
        val gender = Gender.values().toList().shuffled().first()
        val age = Age(0)
        val human = Human(gender, age)
        localHumanRepository.saveHuman(human)
        return human
    }

    // はじめに保存した人間取得
    override suspend fun getHumanFirst(): Human {
        return localHumanRepository.getHumanFirst()
    }

    // ランダムで生成された人間取得
    override fun getHumanRandam() : Human {
        val gender = Gender.values().toList().shuffled().first()
        val age = Age((1..10).random())
        return Human(gender, age)
    }

}