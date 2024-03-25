// create a working list view

package com.example.listviewproject

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val books = arrayOf("Slaughter House 5", "Fahrenheit 451", "Metro 2033",
            "The Lord of the Rings", "All Quiet on the Western Front", "In the Solitude of Cotton Fields")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, books
        )

        listView.adapter = arrayAdapter

        // create toast that will display item selected
        // to remove warnings changed parameters that are not used to an underscore
        listView.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this,"Book Selected ${books[i]}", Toast.LENGTH_LONG).show()
        }

    }
}