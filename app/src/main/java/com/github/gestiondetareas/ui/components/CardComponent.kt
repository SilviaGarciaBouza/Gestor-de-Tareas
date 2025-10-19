package com.github.gestiondetareas.ui.components


import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.github.gestiondetareas.R
import com.github.gestiondetareas.data.Tarea
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun CardComponent(task: Tarea, modifier: Modifier, iscompletedChange: (id: Int) -> Unit) {

    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    Card(modifier = modifier
        .clickable { iscompletedChange(task.id) }
        .fillMaxWidth()) {
        Column(
            modifier = Modifier
                .background(color = if (task.completed) colorResource(R.color.blue_light_color) else  colorResource(R.color.blue_more_light_color))
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource( task.title),
                Modifier.padding(start = 8.dp, end = 8.dp, top = 8.dp),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(task.description),
                Modifier.padding(start = 8.dp, end = 8.dp, top = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(Modifier.height(8.dp))
            Row(modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Fecha tope: ${dateFormat.format(task.endDate)}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(Modifier.weight(1f))
                //Checkbox(checked = task.completed, onCheckedChange =  {iscompletedChange(task.id)} )
                Icon(
                    painter = painterResource(
                        id =
                            if (task.completed == true) {
                                R.drawable.ic_check_circle_green
                            } else {
                                R.drawable.ic_close_circle_red
                            }
                    ), contentDescription = "icon check task completed",Modifier.clickable{iscompletedChange(task.id)}.size(18.dp),
                     tint = Color.Unspecified
                )
                Spacer(Modifier.width(4.dp))
                Text(
                    text = if (task.completed == true) {
                        "Completado"
                    } else {
                        "Pendiente"
                    }, style = MaterialTheme.typography.bodyMedium, color =
                        if (task.completed == true) {
                            colorResource(R.color.green_color)
                        } else {
                            Color.Red
                        }
                )
            }
        }
    }
}