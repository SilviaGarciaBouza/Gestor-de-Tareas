package com.github.gestiondetareas.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.github.gestiondetareas.R
import com.github.gestiondetareas.ui.components.RowCardComponent
import com.github.gestiondetareas.ui.components.TopAppComponent
import com.github.gestiondetareas.viewmodel.TaskViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(taskViewModel: TaskViewModel, modifier: Modifier) {
    val tareasState by taskViewModel.listTareasState.collectAsState()
    Scaffold(
        topBar = {
            TopAppBar( colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(R.color.orange_color)),
                title = {
                    TopAppComponent(
                        numPendingTasks = tareasState.notCompletedTasks,
                        modifier
                    )
                })
        },
        content = { paddingValues ->
            RowCardComponent(
                listTasks = tareasState.taskList,
                modifier = modifier
                    .fillMaxSize()
                    .padding(paddingValues).fillMaxSize(),
                iscompletedChange = taskViewModel::changeIsCompleted
            )
        }


    )


}