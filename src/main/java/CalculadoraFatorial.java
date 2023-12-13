public class CalculadoraFatorial {
    public static double fatorial(double valor) throws ArithmeticException {

        double radical = Math.sqrt(Math.PI * 2 * valor);
        double exponencial = Math.pow(valor, valor) / Math.pow(Math.E, valor);

        return radical * exponencial;
    }
}
