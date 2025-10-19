package com.github.gestiondetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.gestiondetareas.ui.components.RowCardComponent
import com.github.gestiondetareas.ui.components.TopAppComponent
import com.github.gestiondetareas.ui.theme.GestionDeTareasTheme
import com.github.gestiondetareas.viewmodel.TaskViewModel

class MainActivity : ComponentActivity() {
    private val taskViewModel: TaskViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            GestionDeTareasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp(taskViewModel=taskViewModel, modifier = Modifier)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(taskViewModel: TaskViewModel, modifier: Modifier) {
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