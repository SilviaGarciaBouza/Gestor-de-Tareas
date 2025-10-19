package com.github.gestiondetareas.model


import com.github.gestiondetareas.data.Tarea

data class TareasState(
    val taskList: List<Tarea> = emptyList(),
    val notCompletedTasks: Int = taskList.size
)