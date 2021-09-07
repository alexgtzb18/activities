package com.example.activities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Picture(
    val value: String,
    val source: Int,
    val likeable: Boolean = false
) : Parcelable {

    companion object {
        val array = arrayOf(
            Picture("Carro 1", R.drawable.carro1),
            Picture("Carro 2", R.drawable.carro2),
            Picture("Carro 3", R.drawable.carro3),
            Picture("Carro 4", R.drawable.carro4),
            Picture("Carro 5", R.drawable.carro5),
            Picture("Carro 6", R.drawable.carro6)
        )
    }

}