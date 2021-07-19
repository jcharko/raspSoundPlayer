package com.player.player

import com.player.processor.SoundProcessor

class NotePlayer(soundProcessor: SoundProcessor) : Player(soundProcessor) {

    fun play(note: Note) {
        soundProcessor.play(note.pitch, duration = note.duration.value())
    }

    fun play(melody: Melody) {
        melody.notes.forEach { soundProcessor.play(it.pitch, duration = it.duration.value(melody.tempo)) }
    }
}