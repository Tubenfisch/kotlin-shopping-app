package com.example.shoppinglist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val context: Context, private val listItems: List<ListItem>)
    : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(listItem: ListItem, pos: Int) = with(itemView) {
            val tvName = findViewById<TextView>(R.id.tvName)
            tvName.text = listItem.name
            val tvAmount = findViewById<TextView>(R.id.tvAmount)
            tvAmount.text = "Menge:  ${listItem.amount}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listItems[position]
        holder.bind(item, position)
    }

    override fun getItemCount() = listItems.size
}