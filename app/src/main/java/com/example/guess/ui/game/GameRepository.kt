package com.example.guess.ui.game

import com.example.guess.data.remote.RandomWordsApi
import javax.inject.Inject

class GameRepository @Inject constructor(
    private val randomWordsApi: RandomWordsApi
) {
    suspend fun getRandomWords(): List<String> {
        return randomWordsApi.getRandomWords()
    }
}