public class ComplexidadeLinear {
    // Este método precisa olhar CADA elemento para encontrar o 'alvo'.
    // No pior caso (o alvo é o último ou não existe), ele percorre o array inteiro.

    void encontrarValor(int[] array, int alvo) {
     // O loop é a chave da análise. Ele executa 'n' vezes, onde 'n' é o tamanho do array.
    for (int i = 0; i < array.length; i++) { // Este loop é O(n)
      if (array[i] == alvo) {
        System.out.println("Encontrei o valor: " + alvo + " na posição " + i);
        return; // Encontrou, pode parar.
      }
    }
    System.out.println("Não encontrei o valor: " + alvo);
  }

  public static void main(String[] args) {
    ComplexidadeLinear c = new ComplexidadeLinear();
    int[] meuArray = { 10, 20, 30, 40, 50 };
    c.encontrarValor(meuArray, 30); // Rápido
    c.encontrarValor(meuArray, 50); // Percorre tudo (mais lento)
  }
}
