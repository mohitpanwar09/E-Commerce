package com.example.e_commerse.ktActivitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_commerse.KotlinItemClass.AddressAdapter
import com.example.e_commerse.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_address.*

class AddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        address_recyclerView.suppressLayout(true)

        val adapter=GroupAdapter<GroupieViewHolder>()
            adapter.add(AddressAdapter())
            adapter.add(AddressAdapter())
            adapter.add(AddressAdapter())
            adapter.add(AddressAdapter())
        address_recyclerView.adapter=adapter
    }
}