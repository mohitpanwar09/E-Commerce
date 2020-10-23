package com.example.e_commerse.KotlinItemClass

import com.example.e_commerse.R
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class AddressAdapter:Item<GroupieViewHolder>() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

    }

    override fun getLayout(): Int {
        return R.layout.address_pojo
    }
}