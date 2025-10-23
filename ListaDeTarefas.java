import java.util.*;

public class ListaDeTarefas {
  public static void main(String[] args) {
    // --- Criando um ArrayList ---
    // A sintaxe <String> diz que este ArrayList vai guardar apenas Strings.
    // É como etiquetar nosso armário mágico: "Apenas para Textos".

    ArrayList<String> tarefas = new ArrayList<>();

    System.out.println("--- Minha Lista de Tarefas ---");
    System.out.println("A lista está vazia? " + tarefas.isEmpty());
    System.out.println("Tamanho atual: " + tarefas.size());
    
    // --- Adicionando itens ---
    // Usamos o método .add() para colocar itens na lista. Eles são adicionados no final.
    // Lógica: "Lista, adicione esta nova tarefa no final."

    tarefas.add("Compras leite");
    tarefas.add("Praticar Java");
    tarefas.add("Ler um livro");

    System.out.println("\nTarefas adicionadas. Lista atual: " + tarefas);
    System.out.println("Tamanho atual: " + tarefas.size());


    // --- Acessando um item ---
    // Usamos o método .get(indice), que funciona como os colchetes [] do array.
    // Lógica: "Lista, me dê o item que está na posição (índice) 1."
    String segundaTarefa = tarefas.get(1);
    System.out.println("\nMinha segunda tarefa é: " + segundaTarefa);



   // --- Removendo um item ---
   // Podemos remover pelo índice.
   // Lógica: "Lista, remova o item que está na posição 0."
  
    tarefas.remove(0); // Remove a primeira tarefa (compras leite).
    System.out.println("\nLista após remover a primeira tarefa: ");

    // --- Percorrendo a lista com loop ---
    System.out.println("Imprimindo todas as tarefas restantes: ");
    for (int i = 0; i < tarefas.size(); i++) {
      System.out.println("Tarefa " + (i + 1) + ": " + tarefas.get(i));
    }

    
    
    
  }
}
