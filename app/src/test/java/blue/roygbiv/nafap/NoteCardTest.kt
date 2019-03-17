package blue.roygbiv.nafap

import org.amshove.kluent.`should equal`
import org.junit.Test

class NoteCardTest {
    @Test
    fun create_NoteCard() {
        val testName = "test"
        val testDescription = "testDescription"
        val noteCard = NoteCard(testName,testDescription, Category.Analytics)
        noteCard.name `should equal` testName
        noteCard.description `should equal` testDescription
        noteCard.category `should equal` Category.Analytics
    }
}
