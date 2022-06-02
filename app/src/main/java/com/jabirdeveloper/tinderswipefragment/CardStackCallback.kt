package com.jabirdeveloper.tinderswipefragment

import com.jabirdeveloper.tinderswipefragment.ItemModel
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.jabirdeveloper.tinderswipefragment.R
import android.widget.TextView
import com.squareup.picasso.Picasso
import androidx.recyclerview.widget.DiffUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI

class CardStackCallback(private val old: List<ItemModel>, private val baru: List<ItemModel>) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return old.size
    }

    override fun getNewListSize(): Int {
        return baru.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return old[oldItemPosition].image == baru[newItemPosition].image
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return old[oldItemPosition] === baru[newItemPosition]
    }
}