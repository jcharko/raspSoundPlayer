package com.player.processor

import com.pi4j.io.gpio.Pin
import com.pi4j.io.gpio.PinState
import com.pi4j.io.gpio.RaspiPin
import com.pi4j.wiringpi.Gpio

data class SoundProcessorConfiguration(
    val pin: Pin = RaspiPin.GPIO_26,
    val pwmMode: Int = Gpio.PWM_MODE_MS,
    val defaultRange: Int = 550,
    val shutdownState: PinState = PinState.HIGH,
    val pitchMode: Pitch.PitchMode = Pitch.PitchMode.WAVELENGTH
)