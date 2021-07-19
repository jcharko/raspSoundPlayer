package com.player.player

import com.player.processor.Pitch

class SongSheet {

    fun bedeZToba(): Melody {
        val song = listOf(
            Note(Pitch.A4, NoteDuration.QUARTER_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTY_FOURTH_NOTE),
            Note(Pitch.C5, NoteDuration.EIGHT_NOTE),
            Note(Pitch.B4, NoteDuration.EIGHT_NOTE),
            Note(Pitch.A4, NoteDuration.EIGHT_NOTE),
            Note(Pitch.B4, NoteDuration.EIGHT_NOTE),
            Note(Pitch.C5, NoteDuration.EIGHT_NOTE),
            Note(Pitch.A4, NoteDuration.QUARTER_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTY_FOURTH_NOTE),
            Note(Pitch.A4, NoteDuration.EIGHT_NOTE),
            Note(Pitch.A4, NoteDuration.EIGHT_NOTE),
            Note(Pitch.E5, NoteDuration.EIGHT_NOTE),
            Note(Pitch.D5, NoteDuration.EIGHT_NOTE)
        )
        return Melody(song, 120)
    }

    fun mario(): Melody {
        val song = listOf(
            Note(Pitch.E5, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.E5, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.E5, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.C5, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.E5, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.G5, NoteDuration.QUARTER_NOTE),
            Note(Pitch.G4, NoteDuration.QUARTER_NOTE),

            Note(Pitch.C5, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.G4, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.EIGHT_NOTE),
            Note(Pitch.E4, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.A4, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.B4, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.AS_4, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.A4, NoteDuration.SIXTEENTH_NOTE),
            Note(Pitch.PAUSE, NoteDuration.SIXTEENTH_NOTE)
        )
        return Melody(song, 120)
    }
}