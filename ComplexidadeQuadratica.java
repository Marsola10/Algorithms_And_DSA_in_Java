public class ComplexidadeQuadratica {
// Este método verifica se existem elementos duplicados no array.
  void encontrarDuplicatas(String[] array) {
    int n = array.length;
// Loop externo: percorre o array do início ao fim. Roda 'n' vezes.
for (int i = 0; i < n; i++) {
      // Loop interno: para cada elemento do loop externo,
      // percorre o resto do array para comparar. Também roda perto de 'n' vezes.
      for (int j = 0; j < n; j++) {
        if (array[i].equals(array[j])) {
          System.out.println("Duplicata encontrada: " + array[i]);

        }
      }
    }
  }

  public static void main(String[] args) {
    ComplexidadeQuadratica c = new ComplexidadeQuadratica();
    String[] nomes = { "Ana", "Bruno", "Carlos", "Breno", "Ana" };
    // Para n=5, os loops rodam aproximadamente 5*5=25 vezes.
    // Se n=1000, rodaria 1.000.000 de vezes!
    c.encontrarDuplicatas(nomes);
}


}