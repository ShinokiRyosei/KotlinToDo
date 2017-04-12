package tv.shinokin.kotlintodo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById(R.id.edit_text) as EditText
        editText.setText("しのき")

        val text = editText.text
        Toast.makeText(this, text, Toast.LENGTH_LONG)

    }
}
