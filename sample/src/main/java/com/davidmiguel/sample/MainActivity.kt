@file:Suppress("UNUSED_PARAMETER")

package com.davidmiguel.sample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openKeyboardInteger(view: View) {
        val intent = Intent(this, KeyboardIntegerActivity::class.java)
        startActivity(intent)
    }

    fun openKeyboardDecimal(view: View) {
        val intent = Intent(this, KeyboardDecimalActivity::class.java)
        startActivity(intent)
    }

    fun openKeyboardFingerprint(view: View) {
        val intent = Intent(this, KeyboardFingerprintActivity::class.java)
        startActivity(intent)
    }

    fun openKeyboardCustom(view: View) {
        val intent = Intent(this, KeyboardCustomActivity::class.java)
        startActivity(intent)
    }

    fun openKeyboardCustomSquare(view: View) {
        val intent = Intent(this, KeyboardCustomSquareActivity::class.java)
        startActivity(intent)
    }
}
