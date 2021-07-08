package com.example.kmmsharedmodule.repository

import com.example.kmmsharedmodule.model.entity.Human

/**
 * 人間データをローカル制御
 */
interface LocalHumanRepository {

    /**
     * ローカルデータに人間保存
     */
    fun saveHuman(human : Human)

    /**
     * ローカルデータから１人目の人間取り出し
     */
    fun getHumanFirst() : Human
}