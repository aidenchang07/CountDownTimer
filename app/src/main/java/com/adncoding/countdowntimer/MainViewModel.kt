package com.adncoding.countdowntimer

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

/**
 * Created by AidenChang 2024/02/25
 */
class MainViewModel : ViewModel() {
    val countDownFlow = flow {
        val startingValue = 10
        var currentValue = startingValue
        emit(startingValue)

        while (currentValue > 0) {
            delay(1000L)
            currentValue--
            emit(currentValue)
        }
    }
}