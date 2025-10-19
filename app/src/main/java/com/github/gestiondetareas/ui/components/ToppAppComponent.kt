package com.github.gestiondetareas.ui.components


import android.app.Notification
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.github.gestiondetareas.R

@Composable
fun TopAppComponent(numPendingTasks:Int, modifier: Modifier){

    Row(modifier.fillMaxWidth().padding(4.dp)){
        Icon( painter = painterResource(id = R.drawable.ic_pending_tasks_list), contentDescription= "Task icon",modifier.padding(end = 8.dp).size(80.dp),tint = Color.Unspecified )
        Column() {
            Text(text = stringResource(R.string.app_name), style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            Spacer(modifier.weight(1f))
            Text(text = "$numPendingTasks pendientes", style = MaterialTheme.typography.titleMedium)
        }
    }


}