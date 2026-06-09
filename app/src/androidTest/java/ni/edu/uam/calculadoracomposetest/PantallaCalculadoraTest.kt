package ni.edu.uam.calculadoracomposetest

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class PantallaCalculadoraTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun verificarBotonYResultado() {

        composeTestRule.setContent {
            PantallaCalculadora()
        }

        composeTestRule
            .onNodeWithText("Calcular")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("8")
    }
}