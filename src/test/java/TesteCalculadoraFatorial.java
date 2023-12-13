
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCalculadoraFatorial {

    @Test
    @DisplayName("Teste com valor inválido (0)")
    // 0! = 1, por definição
    // Mas é impossível aplicar 0 na fórmula de Stirling,
    // considerando a indeterminação 0^0
    public void testeZero() {
        try {
            double res = CalculadoraFatorial.fatorial(0);
            fail();
        }
        catch (Exception ArithmeticException) {
            assertTrue(true);
        }
    }

    @Test
    @DisplayName("Teste com valores pequenos (1)")
    public void testeValorPequeno() {
        double res = CalculadoraFatorial.fatorial(1);
        double fatorial = 1;

        // os valores são consideravelmente próximos ->
        // margem de erro é próxima de 0

        double diferenca = fatorial - res;
        // redundante calcular erro dividindo por 1
        assertTrue(diferenca < 0.1);
    }

    @Test
    @DisplayName("Teste com valores maiores (1000)")
    public void testeValorMaior() {
        double res = CalculadoraFatorial.fatorial(5);
        double fatorial = 120;


        double diferenca = fatorial - res;
        double erro = diferenca / fatorial;
        assertTrue(erro < 0.1);
    }

    @Test
    @DisplayName("Teste com valor inválido (negativo)")
    public void testeNegativo() {
        try {
            double res = CalculadoraFatorial.fatorial(-1);
            fail();
        }
        catch (Exception ArithmeticException) {
            assertTrue(true);
        }
    }

}