package com.example.nefis

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Video(
    val title: String,
    val subtitle: String,
    val image: Int,
    val description: String,
    val videoResId: Int, // Volvemos a usar el ID de recurso
    val duration: String = "0:00",
    val category: String
) : Parcelable
