package com.github.gestiondetareas.data


import com.github.gestiondetareas.R
import java.util.Locale
import java.text.SimpleDateFormat
import java.util.Date

object TareasDataSource {
    private val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    fun loadTasks():List<Tarea>{
        return listOf(
            Tarea(id = 1, title = R.string.task_1_title, description = R.string.task_1_desc, completed = false, endDate = dateFormat.parse("19/12/2026") ?: Date(0)),
            Tarea(id = 2, title = R.string.task_2_title, description = R.string.task_2_desc, completed = true, endDate = dateFormat.parse("05/04/2025") ?: Date(0)),
            Tarea(id = 3, title = R.string.task_3_title, description = R.string.task_3_desc, completed = true, endDate = dateFormat.parse("02/11/2024") ?: Date(0)),
            Tarea(id = 4, title = R.string.task_4_title, description = R.string.task_4_desc, completed = false, endDate = dateFormat.parse("23/11/2025") ?: Date(0)),
            Tarea(id = 5, title = R.string.task_5_title, description = R.string.task_5_desc, completed = false, endDate = dateFormat.parse("07/06/2026") ?: Date(0)),
            Tarea(id = 6, title = R.string.task_6_title, description = R.string.task_6_desc, completed = false, endDate = dateFormat.parse("25/08/2026") ?: Date(0)),
            Tarea(id = 7, title = R.string.task_7_title, description = R.string.task_7_desc, completed = true, endDate = dateFormat.parse("16/01/2025") ?: Date(0)),
            Tarea(id = 8, title = R.string.task_8_title, description = R.string.task_8_desc, completed = true, endDate = dateFormat.parse("11/02/2025") ?: Date(0)),
            Tarea(id = 9, title = R.string.task_9_title, description = R.string.task_9_desc, completed = false, endDate = dateFormat.parse("08/11/2026") ?: Date(0)),
            Tarea(id = 10, title = R.string.task_10_title, description = R.string.task_10_desc, completed = true, endDate = dateFormat.parse("28/12/2024") ?: Date(0)),
            Tarea(id = 11, title = R.string.task_11_title, description = R.string.task_11_desc, completed = false, endDate = dateFormat.parse("01/11/2025") ?: Date(0)),
            Tarea(id = 12, title = R.string.task_12_title, description = R.string.task_12_desc, completed = false, endDate = dateFormat.parse("17/12/2025") ?: Date(0)),
            Tarea(id = 13, title = R.string.task_13_title, description = R.string.task_13_desc, completed = true, endDate = dateFormat.parse("10/11/2024") ?: Date(0)),
            Tarea(id = 14, title = R.string.task_14_title, description = R.string.task_14_desc, completed = false, endDate = dateFormat.parse("30/12/2025") ?: Date(0)),
            Tarea(id = 15, title = R.string.task_15_title, description = R.string.task_15_desc, completed = true, endDate = dateFormat.parse("26/01/2024") ?: Date(0)),
            Tarea(id = 16, title = R.string.task_16_title, description = R.string.task_16_desc, completed = true, endDate = dateFormat.parse("21/03/2024") ?: Date(0)),
            Tarea(id = 17, title = R.string.task_17_title, description = R.string.task_17_desc, completed = false, endDate = dateFormat.parse("03/12/2025") ?: Date(0)),
            Tarea(id = 18, title = R.string.task_18_title, description = R.string.task_18_desc, completed = true, endDate = dateFormat.parse("29/11/2025") ?: Date(0)),
            Tarea(id = 19, title = R.string.task_19_title, description = R.string.task_19_desc, completed = true, endDate = dateFormat.parse("09/01/2024") ?: Date(0)),
            Tarea(id = 20, title = R.string.task_20_title, description = R.string.task_20_desc, completed = false, endDate = dateFormat.parse("15/11/2025") ?: Date(0)),
            Tarea(id = 21, title = R.string.task_21_title, description = R.string.task_21_desc, completed = false, endDate = dateFormat.parse("22/11/2026") ?: Date(0)),
            Tarea(id = 22, title = R.string.task_22_title, description = R.string.task_22_desc, completed = true, endDate = dateFormat.parse("06/02/2025") ?: Date(0)),
            Tarea(id = 23, title = R.string.task_23_title, description = R.string.task_23_desc, completed = true, endDate = dateFormat.parse("13/12/2024") ?: Date(0)),
            Tarea(id = 24, title = R.string.task_24_title, description = R.string.task_24_desc, completed = true, endDate = dateFormat.parse("27/11/2024") ?: Date(0)),
            Tarea(id = 25, title = R.string.task_25_title, description = R.string.task_25_desc, completed = false, endDate = dateFormat.parse("20/11/2026") ?: Date(0)),
            Tarea(id = 26, title = R.string.task_26_title, description = R.string.task_26_desc, completed = false, endDate = dateFormat.parse("24/12/2025") ?: Date(0)),
            Tarea(id = 27, title = R.string.task_27_title, description = R.string.task_27_desc, completed = false, endDate = dateFormat.parse("04/12/2025") ?: Date(0)),
            Tarea(id = 28, title = R.string.task_28_title, description = R.string.task_28_desc, completed = false, endDate = dateFormat.parse("12/12/2025") ?: Date(0)),
            Tarea(id = 29, title = R.string.task_29_title, description = R.string.task_29_desc, completed = true, endDate = dateFormat.parse("18/01/2025") ?: Date(0)),
            Tarea(id = 30, title = R.string.task_30_title, description = R.string.task_30_desc, completed = true, endDate = dateFormat.parse("14/11/2024") ?: Date(0))
        )
    }
}
