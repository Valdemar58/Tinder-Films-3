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

class ItemModel {
    var image = 0
        private set
    var nama: String? = null
        private set
    var usia: String? = null
        private set
    var kota: String? = null
        private set

    constructor() {}
    constructor(image: Int, nama: String?, usia: String?, kota: String?) {
        this.image = image
        this.nama = nama
        this.usia = usia
        this.kota = kota
    }
}