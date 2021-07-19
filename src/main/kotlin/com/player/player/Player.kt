package com.player.player

import com.player.processor.SoundProcessor

abstract class Player(var soundProcessor: SoundProcessor) {
    fun turnOff() = soundProcessor.turnOff()
}