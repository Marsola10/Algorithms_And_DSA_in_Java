import java.util.*;

public class SocialNetworkGraph {

  // Usamos um HashMap para implementar a Lista de Adjacência.
  // A Chave é o nome da pessoa (Vértice).
  // O Valor é uma Lista de seus amigos (Vértices adjacences)

  private Map<String, List<String>> adjacencies = new HashMap<>();
  
  // Adciona uma nova pessoa (vértice) ao grafo.
  public void addVertex(String person) {
    adjacencies.putIfAbsent(person, new ArrayList<>());

  }
  
  // Adciona uma amizade (aresta) entre duas pessoas.
  // Como é uma rede social, a amizade é mútua (não-direcionada).
  public void addEdge(String person1, String person2) {
    // Garante que ambos existem no grafo.
    addVertex(person1);
    addVertex(person2);

    // Adiciona person2 à lista de amigos de person1.
    adjacencies.get(person1).add(person2);

    // Adiciona person1 à lista de amigos de person2.
    adjacencies.get(person2).add(person1);
  }
  
  // Retorna a lista de amigos de uma pessoa.
  public List<String> getFriends(String person) {
    return adjacencies.get(person);
  }


  public static void main(String[] args) {
    SocialNetworkGraph network = new SocialNetworkGraph();
    network.addEdge("Alice", "Bob");
    network.addEdge("Alice", "Carol");
    network.addEdge("Bob", "David");
    network.addEdge("Carol", "David");

    // Imprimindo as conexões
    System.out.println("Amigos da Alice: " + network.getFriends("Alice"));
    System.out.println("Amigos do Bob: " + network.getFriends("Bob"));
    System.out.println("Amigos do David " + network.getFriends("David"));

  }
}
