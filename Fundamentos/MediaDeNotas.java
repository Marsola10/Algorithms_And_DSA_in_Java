public class MediaDeNotas {
  public static void main(String[] args) {
      // --- Criando um Array ---

      // 1. Declarando o Array:
        // double[] significa "um array que vai guardar valores do tipo double".
        // 'notas' é o nome do nosso "armário".
    double[] notas;
      // 2. Inicializando o Array:
        // 'new double[5]' significa "crie um novo armário de doubles com 5 gavetas".
        // Neste momento, as 5 gavetas estão vazias (contêm 0.0).
    notas = new double[5];
// --- Colocando valores no Array (nas gavetas) ---

        // Para acessar uma gaveta, usamos o nome do array e o índice entre colchetes [].
        // Lembre-se: a primeira gaveta é a de índice 0!

    notas[0] = 7.5; // Guarda 7.5 na primeira gaveta (índice 0).
    notas[1] = 9.0; // Guarda 9.0 na segunda gaveta (índice 1).
    notas[2] = 6.5;
    notas[3] = 8.0;
    notas[4] = 10.0; // Última gaveta (índice 4).
    
    // --- Acessando valores do Array ---

        // Vamos imprimir a nota da terceira prova (que está no índice 2).

        System.out.println("A nota da terceira prova foi: " + notas[2]); // Saída: 6.5
  
    // E se tentarmos acessar um índice que não existe?
        // notas[5] daria um erro! (ArrayIndexOutOfBoundsException), pois as gavetas vão de 0 a 4.

   
   // Existe uma forma mais curta de criar um array já com os valores:
    String[] diasDaSemana = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" };

    System.out.println("O terceiro dia da semana é: " + diasDaSemana[2]);
  }
  
}
