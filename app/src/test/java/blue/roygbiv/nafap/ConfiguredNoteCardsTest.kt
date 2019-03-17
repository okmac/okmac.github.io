package blue.roygbiv.nafap

import org.amshove.kluent.`should equal`
import org.amshove.kluent.should
import org.junit.Test

class ConfiguredNoteCardsTest {
    private var subject = ConfiguredNoteCards()

    @Test
    fun iterate_over_NoteCards() {
        (0..5).forEach { x ->
                val foundCard = subject.getNextNoteCard()
                val expectedCard = subject.noteCards[x]
                foundCard.name `should equal` expectedCard.name
        }
    }

    @Test
    fun iterator_set_to_0_after_reach_end_of_list() {
        val testNoteCards = subject.noteCards
        (0 until testNoteCards.size - 1).forEach {
            subject.getNextNoteCard()
        }
        subject.getNextNoteCard().name `should equal` testNoteCards.last().name

        subject.getNextNoteCard().name `should equal` testNoteCards[0].name
        subject.getNextNoteCard().name `should equal` testNoteCards[1].name
    }
}
