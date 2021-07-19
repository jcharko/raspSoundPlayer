import com.player.player.NotePlayer
import com.player.player.SongSheet
import com.player.processor.SoundProcessor
import com.player.processor.SoundProcessorConfiguration

fun main() {
    val player = NotePlayer(SoundProcessor(SoundProcessorConfiguration()))
    val melody = SongSheet().mario()
    player.play(melody)
    player.turnOff()
}