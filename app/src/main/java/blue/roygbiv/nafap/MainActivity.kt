package blue.roygbiv.nafap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val configuration = ConfiguredNoteCards()
    private var currentCard = configuration.noteCards[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeNewCard()
    }

    fun flipCard(view: View) = if(cardDescription.text.isNullOrBlank()){
        cardDescription.text = currentCard.description
    }else{
        initializeNewCard()
    }

    private fun initializeNewCard(){
        cardDescription.text = ""
        currentCard = configuration.getNextNoteCard()
        cardName.text = currentCard.name
    }
}
