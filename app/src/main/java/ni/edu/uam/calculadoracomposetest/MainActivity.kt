package ni.edu.uam.calculadoracomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

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

    Column {

        Button(
            onClick = {
                resultado = calculadora.sumar(5, 3).toString()
            }
        ) {
            Text("Calcular")
        }

        Text(
            text = resultado,
            modifier = Modifier.testTag("resultado")
        )
    }
}