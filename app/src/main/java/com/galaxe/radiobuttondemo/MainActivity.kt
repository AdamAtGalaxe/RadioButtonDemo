package com.galaxe.radiobuttondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }
    // Get the selected radio button text using radio button on click listener
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.Adam ->
                    if (checked) {
                        Toast.makeText(this, "Yeah I am!", Toast.LENGTH_LONG).show()
                    }
                R.id.Roberts ->
                    if (checked) {
                        Toast.makeText(this, "Who me?!", Toast.LENGTH_LONG).show()
                    }
            }
        }
    }
}