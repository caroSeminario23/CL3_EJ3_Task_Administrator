package com.example.taskadministrator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskadministrator.ui.theme.TaskAdministratorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            TaskAdministratorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskAdministratorApp()
                }
            }
        }
    }
}

@Composable
fun TaskAdministratorApp() {
    TaskCard(
        mensajeTareas = stringResource(R.string.mensaje_tareas_text),
        mensajeInspirador = stringResource(R.string.mensaje_inspirador_text),
        imagenCentral = painterResource(R.drawable.ic_task_completed))
}

@Composable
fun TaskCard(
    mensajeTareas: String,
    mensajeInspirador: String,
    imagenCentral: Painter,
    modifier: Modifier = Modifier

) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Image(
            painter = imagenCentral,
            contentDescription = "Símbolo de check en verde"
        )

        Text(
            text = mensajeTareas,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = mensajeInspirador,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskAdministratorPreview() {
    TaskAdministratorTheme {
        TaskAdministratorApp()
    }
}