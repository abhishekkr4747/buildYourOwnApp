package com.example.guess.domain

import com.example.guess.ui.game.GameRepository
import javax.inject.Inject

class RandomWordUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend fun getRandomWords(): List<String> {
        val words = gameRepository.getRandomWords()
        return words.asSequence().shuffled().take(3).toList()
    }
 }