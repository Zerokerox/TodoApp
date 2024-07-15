package com.example.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.ui.Modifier
import com.example.todoapp.ui.theme.TodoAppTheme
import androidx.compose.material3.Surface
import com.example.todoapp.TodoListPage
import androidx.lifecycle.ViewModelProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val todoViewModel = ViewModelProvider(this)[TodoViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            TodoAppTheme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                    .statusBarsPadding()) {
                    TodoListPage(todoViewModel)
                }
            }
        }
    }
}

