public class ComplexidadeConstante {


  void imprimirPrimeiroElemento(int[] array) {

    System.out.println("O primeiro elemento é: " + array[0]);

  }
  
  public static void main(String[] args) {
    ComplexidadeConstante c = new ComplexidadeConstante();
    int[] arrayPequeno = { 1, 2, 3 };
    int[] arrayGigante = new int[1000000];
    arrayGigante[0] = 99;

    c.imprimirPrimeiroElemento(arrayPequeno);
    c.imprimirPrimeiroElemento(arrayGigante);
  
  
  }
  
}

/*
 * Explicação:O(1) — Tempo Constante:
 * O que significa: O tempo de execução é constante. Não importa se a entrada tem 10 itens ou 10 milhões de itens, a operação leva sempre o mesmo tempo. É       incrivelmente rápido.
 * Analogia: Pegar o primeiro item de uma caixa. Não importa se a caixa tem 1 ou 1000 itens, pegar o primeiro leva o mesmo esforço.
 * Exemplo Prático: Acessar um elemento em um Array pelo seu índice ou buscar um valor em um HashMap pela sua chave.
 */