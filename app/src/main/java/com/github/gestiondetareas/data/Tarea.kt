package com.github.gestiondetareas.data

import java.util.Date

data class Tarea(
    val id:Int,
    val title: String,
    val description: String,
    val endDate: Date,
    val completed: Boolean = false
)