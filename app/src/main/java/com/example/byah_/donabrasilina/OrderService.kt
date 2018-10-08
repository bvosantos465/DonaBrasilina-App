package com.example.byah_.donabrasilina

import android.content.Context

object OrderService{
    fun getOrders(contexto: Context ): List<Order>{
        val orders = mutableListOf<Order>()
        for (i in 1..5){
            val o = Order()
            o.nome  = "Pedido $i"
            o.product = "Produto $i"
            o.value = "Valor $i"
            o.quantity = "Quantidade $i"
            o.image = o.image
            orders.add(o)
        }
        return orders
    }
}