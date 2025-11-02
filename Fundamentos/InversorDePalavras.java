import java.util.*;
// Stack é uma estrutura de dados do tipo LIFO (Last In, First Out),
public class InversorDePalavras {
  
  public static void main(String[] args) {
    String palavraOriginal = "Java";
    System.out.println("Palavra original: " + palavraOriginal);

      // --- Criando e Usando a Stack ---

      // 1. Criar uma Stack que vai guardar caracteres (Character).
      //    (Nota: Em coleções como Stack, usamos 'Character' em vez do tipo primitivo 'char').
    
    
    Stack<Character> pilhaDeLetras = new Stack<>();

    // 2. Empilhar (push) cada letra da palavra na Stack.
    //    Usamos um loop 'for' para percorrer a palavra.

    System.out.println("\nEmpilhando as letras: ");
    for (int i = 0; i < palavraOriginal.length(); i++) {
      char letra = palavraOriginal.charAt(i);
      pilhaDeLetras.push(letra);
      System.out.println("Push: " + letra + "-> Pilha atual: " + pilhaDeLetras);
    }
    // Ao final, a pilha estará assim (de baixo para cima): [J, a, v, a]

    // 3. Desempilhar (pop) as letras para formar a palavra invertida.
    //    Enquanto a pilha não estiver vazia (.isEmpty() == false), continuamos tirando letras.
    
    String palavraInvertida = "";
    System.out.println("\nDesempilhando as letras: ");
    while (!pilhaDeLetras.isEmpty()) {
      char letraDoTopo = pilhaDeLetras.pop();
      palavraInvertida = palavraInvertida + letraDoTopo;
      System.out.println("Pop: " + letraDoTopo + "-> Palavra invertida agora é: " + palavraInvertida + "'");
    }
    // A primeira letra a sair é 'a' (a última que entrou), depois 'v', etc.
    System.out.println("\nResultado final: " + palavraInvertida);
  }
  
}
