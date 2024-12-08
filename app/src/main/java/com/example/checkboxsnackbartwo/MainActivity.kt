package com.example.checkboxsnackbartwo

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val checkBoxInfo = findViewById<CheckBox>(R.id.checkbox_info)
        val textViewInfo = findViewById<TextView>(R.id.textview_info)
        val textViewRules = findViewById<TextView>(R.id.textview_rules)
        checkBoxInfo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                textViewInfo.text = "Правила дорожного движения"
                textViewInfo.visibility = TextView.VISIBLE
                val rules = """
                    1. Соблюдайте скоростной режим.
                    2. Пропускайте пешеходов на переходах.
                    3. Не пользуйтесь телефоном за рулем.
                    4. Пристегивайте ремни безопасности.
                """.trimIndent()
                textViewRules.text = rules
                textViewRules.visibility = TextView.VISIBLE
            } else {
                textViewInfo.text = ""
                textViewInfo.visibility = TextView.GONE
                textViewRules.text = ""
                textViewRules.visibility = TextView.GONE
            }
        }
    }
}