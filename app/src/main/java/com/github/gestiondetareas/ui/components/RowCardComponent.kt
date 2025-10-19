package com.github.gestiondetareas.ui.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.github.gestiondetareas.data.Tarea

@Composable
fun RowCardComponent(listTasks: List<Tarea>, modifier: Modifier, iscompletedChange: (id:Int) -> Unit) {
    LazyColumn(
        verticalArrangement = Arrangement
        .spacedBy(16.dp),
        modifier = modifier.
        fillMaxSize()) {
        items(listTasks.size) { index ->
            CardComponent(task = listTasks[index],
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                {iscompletedChange(listTasks[index].id)})
        }
    }
}
