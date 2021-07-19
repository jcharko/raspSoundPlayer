package com.player.processor

import com.pi4j.io.gpio.GpioFactory
import com.pi4j.io.gpio.GpioPinPwmOutput
import com.pi4j.io.gpio.RaspiPin
import com.pi4j.util.CommandArgumentParser
import com.pi4j.wiringpi.Gpio

class SoundProcessor(private val config: SoundProcessorConfiguration) {

    private val gpio = GpioFactory.getInstance()
    private val pwm: GpioPinPwmOutput

    init {
        val pin = CommandArgumentParser.getPin(RaspiPin::class.java, config.pin)
        pwm  = gpio.provisionPwmOutputPin(pin)
        pwm.setShutdownOptions(true, config.shutdownState)
        Gpio.pwmSetMode(config.pwmMode)
        Gpio.pwmSetRange(config.defaultRange)
    }

    fun play(pitch: Pitch, volume: Int = 100) {
        pwm.pwm = volume
        Gpio.pwmSetClock(pitch.pitch(config.pitchMode).toInt())
    }

    fun play(pitch: Pitch, volume: Int = 100, duration: Long) {
        pwm.pwm = volume
        Gpio.pwmSetClock(pitch.pitch(config.pitchMode).toInt())
        Thread.sleep(duration)
        pwm.pwm = 0
    }

    fun turnOff() = gpio.shutdown()
}