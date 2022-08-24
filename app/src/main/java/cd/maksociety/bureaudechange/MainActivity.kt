package cd.maksociety.bureaudechange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var taux_du_jour = 2030
        val text_taux = findViewById<TextView>(R.id.taux_jour)
        val button_next_page = findViewById<Button>(R.id.valid_button)


        text_taux.text = "1 dollars vaut $taux_du_jour FC"
        button_next_page.setOnClickListener {
            finish()
        }

    }
}