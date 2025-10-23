public class MediaComArray {
  public static void main(String[] args) {
      // Criei o array de notas
    double[] notas = { 7.5, 9.0, 6.5, 8.0, 10.0 };

    // Criei uma vertical para somar todas as notas
    double somaTotal = 0;

    // --- usando um 'loop' 'for' para percorrer o array ---

    // 'notas.length' é uma propriedade mágica que nos diz o tamanho do array
    // o loop vai de i = 0 até i < 5 (ou seja, i vai ser 0, 1, 2, 3, 4).

    for (int i = 0; i < notas.length; i++) {
      // A cada volta do loop, 'i' representa o índice atual.
      // Na primeira volta, pegamos notas[0]. Na segunda, notas[1], e assim por diante.
      somaTotal = somaTotal + notas[i];


      // Abaixo dá para ver o que acontece em cada passo:
      System.out.println("Volta " + i + ": Somando a nota " + notas[i] + ". Soma atual: " + somaTotal);

    }

    // Após terminar o loop, 'somaTotal' terá a soma de toas as notas.
    System.out.println("\n--- Resultado Final ---");
    System.out.println("A soma de todas as notas é: " + somaTotal);

    // Para calcular a média, dividimos a soma opelo número de notas.
    double media = somaTotal / notas.length;
    System.out.println("A média das notas é: " + media);

    }
}
