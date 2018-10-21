package com.example.byah_.donabrasilina

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.Response


object OrderService{
    val host = "http://bvosantos.pythonanywhere.com"
    val TAG = "WS_DBApp"

    fun getOrders(contexto: Context ): List<Order> {
        if (AndroidUtils.isInternetDisponivel(contexto)) {
            val url = "$host/produtos"
            val json = HttpHelper.get(url)
            return parserJson(json)
        } else {
            return ArrayList<Order>()
        }
    }

     fun save(order: Order): Response {
        val json = HttpHelper.post("$host/orders", order.toJson())
        return parserJson(json)
    }


    fun delete(order: Order): Response {
        Log.d(TAG, order.id.toString())
        val url = "$host/produtos/${order.id}"
        val json = HttpHelper.delete(url)
        Log.d(TAG, json)
        return parserJson(json)
    }

    inline fun <reified T> parserJson(json: String): T {
        val type = object : TypeToken<T>(){}.type
        return Gson().fromJson<T>(json, type)
    }
}