package ni.edu.uam.calculadoracomposetest

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculadoraTest {

    @Test
    fun verificarSuma() {

        val calculadora = Calculadora()

        val resultado = calculadora.sumar(5, 3)

        assertEquals(8, resultado)
    }

    @Test
    fun verificarResta() {

        val calculadora = Calculadora()

        val resultado = calculadora.restar(10, 4)

        assertEquals(6, resultado)
    }

    @Test
    fun verificarMultiplicacion() {

        val resultado = Calculadora().multiplicar(4, 3)

        assertEquals(12, resultado)
    }
}