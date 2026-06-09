package ni.edu.uam.calculadoracomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PantallaCalculadora()
        }
    }
}

@Composable
fun PantallaCalculadora() {

    val calculadora = Calculadora()

    var resultado by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {
                resultado = "Resultado de la suma: ${calculadora.sumar(5, 3)}"
            }
        ) {
            Text("Sumar")
        }

        Button(
            onClick = {
                resultado = "Resultado de la resta: ${calculadora.restar(10, 4)}"
            }
        ) {
            Text("Restar")
        }

        Text(
            text = resultado,
            modifier = Modifier.testTag("resultado")
        )
    }
}