package com.example.notekeeper

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.notekeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        comments left intentionally.  These method calls have been deprecated so this is what we have to change to get the basic app to compile
//        setContentView(R.layout.activity_main)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setSupportActionBar(findViewById(R.id.toolbar))
        setContentView(view)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val originalValue = binding.textDisplayValue
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}