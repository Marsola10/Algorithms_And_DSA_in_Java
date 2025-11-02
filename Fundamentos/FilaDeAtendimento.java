import java.util.*;

// Queue é uma estrutura de dados do tipo FIFO (First In, First Out),
public class FilaDeAtendimento {
  public static void main(String[] args) {
  // --- Criando uma Queue ---
  // Criamos uma Queue de Strings (nomes das pessoas).
  // Usamos a implementação LinkedList, que sabe como se comportar como uma Queue.

  Queue<String> fila = new LinkedList<>();
    
  // --- Adicionando pessoas à fila ---
  // O método .add() insere no final.

    System.out.println("Abrindo a fila de atendimento...");
    fila.add("Cliente A");
    System.out.println("Cliente A entrou na fila. Fila atual: " + fila);
    fila.add("Cliente B");
    System.out.println("Cliente B entrou na fila. Fila atual: " + fila);
    fila.add("Cliente C");
    System.out.println("Cliente C entrou na fila. Fila atual: " + fila);

    // --- Atendendo as pessoas ---
    // O método .poll() remove do início.
    System.out.println("\nIniciando os atendimentos...");
    // Enquanto a fila não estiver vazia...
    while (!fila.isEmpty()) {
    // .poll() remove o primeiro da fila e o retorna.
      String proximoCliente = fila.poll();
      System.out.println("Atendendo: " + proximoCliente);
      System.out.println(" Fila restate: " + fila);
    // Simula um tempo de atendimento
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      
    }
    System.out.println("\nTodos os clientes foram atendidos. A fila está vazia.");

    }  
}
