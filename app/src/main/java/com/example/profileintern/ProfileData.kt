package com.example.profileintern

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ProfileData(
    @DrawableRes var imageId: Int,
    var firstName: String,
    var lastName : String? = null,
    var lastMessage : String? = null
)