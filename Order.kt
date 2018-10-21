package com.example.byah_.donabrasilina

import com.google.gson.GsonBuilder
import java.io.Serializable

class Order : Serializable {

    var id:Long = 0
    var product = ""
    var nome = ""
    var value = ""
    var quantity = ""
    var image = ""

    override fun toString(): String {
        return "Orders(nome='$nome')"
    }

    fun toJson(): String {
        return GsonBuilder().create().toJson(this)
    }

}