import java.util.*;

public class SocialNetworkGraph {

  private Map<String, List<String>> adjacencies = new HashMap<>();
  

  public void addVertex(String person) {
    adjacencies.putIfAbsent(person, new ArrayList<>());

  }
  
  public void addEdge(String person1, String person2) {
    addVertex(person1);
    addVertex(person2);

    adjacencies.get(person1).add(person2);

    adjacencies.get(person2).add(person1);
  }

  public List<String> getFriends(String person) {
    return adjacencies.get(person);
  }


  public static void main(String[] args) {
    SocialNetworkGraph network = new SocialNetworkGraph();
    network.addEdge("Alice", "Bob");
    network.addEdge("Alice", "Carol");
    network.addEdge("Bob", "David");
    network.addEdge("Carol", "David");


    System.out.println("Amigos da Alice: " + network.getFriends("Alice"));
    System.out.println("Amigos do Bob: " + network.getFriends("Bob"));
    System.out.println("Amigos do David " + network.getFriends("David"));

  }
}
