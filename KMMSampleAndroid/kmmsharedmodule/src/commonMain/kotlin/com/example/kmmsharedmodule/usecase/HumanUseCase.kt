package com.example.kmmsharedmodule.usecase

import com.example.kmmsharedmodule.model.entity.Human

/**
 * 人間に関するビジネスロジック
 */
interface HumanUseCase {

    /**
     * 赤ちゃんが生まれる
     * @return 年齢が0才の人間
     */
    fun bornHuman() : Human


    /**
     * ローカルデータから１人目の人間とりだし
     * @return 人間
     */
    suspend fun getHumanFirst() : Human

    /**
     * ランダムで生成された人間取得
     * @return 人間
     */
    fun getHumanRandam() : Human
}