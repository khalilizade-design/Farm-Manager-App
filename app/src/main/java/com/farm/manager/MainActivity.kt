package com.farm.manager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.farm.manager.ui.screens.HomeScreen
import com.farm.manager.ui.theme.FarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FarmTheme { Surface(modifier = Modifier.fillMaxSize()) { Column(modifier = Modifier.padding(12.dp)) { HomeScreen() } } } }
    }
}
