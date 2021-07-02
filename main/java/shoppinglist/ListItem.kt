package com.example.shoppinglist

data class ListItem (val name: String, val amount: Int) {
    val image = "https://picsum.photos/150?random=$amount"
}