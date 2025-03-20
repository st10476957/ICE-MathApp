package vcmsa.ci.mathapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



            var textView = findViewById<TextView>(R.id.textView2)
            val editText = findViewById<EditText>(R.id.etNum1)
            val editText2 = findViewById<EditText>(R.id.etNum2)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.text = "Result"+ (editText.text.toString().toInt()+editText2.text.toString().toInt())




        }

    }
}