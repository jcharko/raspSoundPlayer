package com.player.player

enum class NoteDuration(val size: Double) {
    WHOLE_NOTE(4000.0),
    HALF_NOTE(2000.0),
    QUARTER_NOTE(1000.0),
    EIGHT_NOTE(500.0),
    SIXTEENTH_NOTE(250.0),
    THIRTY_SECOND_NOTE(125.0),
    SIXTY_FOURTH_NOTE(62.5);

    fun value(tempo: Long = 60) : Long {
        val defaultTempo = 60
        return ((size * defaultTempo) / tempo).toLong()
    }
}