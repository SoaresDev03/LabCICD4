package sptech.school.exemplo_actions.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcluadoraServiceTests {

    @Test
    @DisplayName("Quando adicionado com 10 e 2, entao deve retornar 5")
    public void testDividir() {
        // Arrange
        CalculadoraService calculadoraService = new CalculadoraService();
        int a = 10;
        int b = 2;
        double esperado = 5;

        double resultado = calculadoraService.dividir(a,b);
        assertEquals(esperado, resultado);
    }
}
