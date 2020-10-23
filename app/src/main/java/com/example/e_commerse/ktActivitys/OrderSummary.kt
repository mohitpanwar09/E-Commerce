package com.example.e_commerse.ktActivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_commerse.KotlinItemClass.FetchItem
import com.example.e_commerse.R
import kotlinx.android.synthetic.main.activity_order_summary.*

class OrderSummary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_summary)

        val prodDetails=intent.getParcelableExtra<FetchItem>("ProductDe")
        orderSumery_product_name.text=prodDetails!!.productName


        order_summary_placeButton.setOnClickListener {
            val intent=Intent(this,PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}