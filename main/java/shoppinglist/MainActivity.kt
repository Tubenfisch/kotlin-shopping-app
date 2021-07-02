package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: View = findViewById(R.id.btnAdd)
        fab.setOnClickListener {
            val intent = Intent(this, AddItem::class.java)
            startActivity((intent))
        }

        val items = createItems()

        val recycler = findViewById<RecyclerView>(R.id.rvItemList)

        recycler.adapter = ItemAdapter(this, items)
    }

    private fun createItems(): List<ListItem>{
        val items = mutableListOf<ListItem>()
        //add item count later
        for (i in 1..15){
            items.add(ListItem("Item #$i", i))
        }
        return  items
    }
}