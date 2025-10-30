import java.util.*;


public class PlayList {
  public static void main(String[] args) {
    LinkedList<String> playlist = new LinkedList<>();

    // .add() funciona como no ArrayList, adicionando ao final.
    playlist.add("Música A");
    playlist.add("Música C");
    playlist.add("Música D");

    System.out.println("Playlist inicial: " + playlist);

    // --- Vantagem da LinkedList: Adicionar no início ou no meio ---

    // Adicionando no início (muito rápido!)
    // Lógica: "Lista, adicione esta música na primeira posição."
    playlist.addFirst("Música de Abertura");
    System.out.println("Playlist após addFirst: " + playlist);


    // Adicionando em uma posição específica (índice 2)
    // Lógica: "Lista, adicione 'Música B' na posição 2."
    // Por baixo dos panos, ele percorre até a posição 2 e refaz as conexões.
    playlist.add(2, "Música B");
    System.out.println("Playlist após aicionar no meio: " + playlist);

   
    // --- Acesso por índice (lento!) ---
    // Lógica: "Lista, comece do início e vá pulando de vagão em vagão até chegar na posição 3."
    System.out.println("\nA quarta música da lista é: " + playlist.get(3));
    
    // Removendo do final (muito rápido!)
    playlist.removeLast();
    System.out.println("\nPlaylist após remover a última: " + playlist);
  }
}
