package com.example.appdatabindingexample.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Article(
    var title: String,
    var description: String
) : Parcelable