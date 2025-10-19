public class Tabuada {
  public static void main(String[] args) {
   // O número para o qual se quer gerar a tabuada.
    int numero = 7;

    System.out.println("--- Tabuada do " + numero + "---");

        // Cria um loop que vai de 1 até 10.
        // 1. Inicialização: 'int i = 1;' -> o contador 'i' começa valendo 1.
        // 2. Condição: 'i <= 10;' -> o loop vai continuar enquanto 'i' for menor ou igual a 10.
        // 3. Incremento: 'i++' -> ao final de cada volta, o valor de 'i' aumenta em 1.

        for (int i = 1; i <= 10; i++) {
            // Este bloco de código será repetido 10 vezes.
            // A cada volta, o valor de 'i' será diferente (1, 2, 3, ..., 10).
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
  }
}