package com.github.gestiondetareas.data

import androidx.annotation.StringRes
import java.util.Date

data class Tarea(
    val id:Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    val endDate: Date,
    val completed: Boolean = false
)