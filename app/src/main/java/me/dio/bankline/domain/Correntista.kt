package me.dio.bankline.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Correntista(
    val id: Int
) : Parcelable
