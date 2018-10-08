package com.example.byah_.donabrasilina

import java.io.Serializable

class Order : Serializable {

    var id:Long = 0
    var product = ""
    var nome = ""
    var value = ""
    var quantity = ""
    var image = R.drawable.produto

    override fun toString(): String {
        return "Orders(nome='$nome')"
    }
}