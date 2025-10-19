package com.github.gestiondetareas.viewmodel


import androidx.lifecycle.ViewModel
import com.github.gestiondetareas.data.Tarea
import com.github.gestiondetareas.data.TareasDataSource
import com.github.gestiondetareas.model.TareasState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.map
import java.util.Date

class TaskViewModel : ViewModel() {
    val listTAsks: List<Tarea> = TareasDataSource.loadTasks()
    val pendingTasks: Int = listTAsks.count { e -> !e.completed }

    private val _listTareasState =
        MutableStateFlow(TareasState(taskList = listTAsks, notCompletedTasks = pendingTasks))
    val listTareasState: StateFlow<TareasState> = _listTareasState

    fun changeIsCompleted(idTask: Int) {
        val currentListTasks = _listTareasState.value.taskList
        val updateListTAsk = currentListTasks.map {
            e ->
            if(e.id == idTask){
                e.copy(completed = !e.completed)
            }else{e}
        }
        val updatedPendingTasks =updateListTAsk.count{!it.completed}
        _listTareasState.value =
            _listTareasState.value.copy(updateListTAsk, updatedPendingTasks)
    }

    fun addTask(id: Int, title: String, content: String, date: Date, completed: Boolean ){
        val currentTaskList= _listTareasState.value.taskList
        val updateTaskList=currentTaskList + Tarea(id, title,content,date, completed)
        val updatependingTasks = updateTaskList.count{!it.completed}
        _listTareasState.value= _listTareasState.value.copy(updateTaskList, )
    }

    fun removeTask(id: Int){
        val currentTasList = _listTareasState.value.taskList
        val updateTaskList =currentTasList.filter { it.id!=id }
        val updatePendingList = updateTaskList.count{!it.completed}
        _listTareasState.value= _listTareasState.value.copy(updateTaskList,updatePendingList)
    }

}