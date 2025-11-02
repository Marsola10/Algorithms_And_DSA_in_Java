// Agora a classe que gerencia a árvore como um todo.

public class BinarySearchTree {

  // A árvore só precisa saber quem é a sua raíz.
  Node root;

  // Método público para começar a inserção.
  public void insert(int value) {
    // A lógica real está em um método recursivo auxiliar.
    root = insertRecursive(root, value);
  }


  // --- O CORAÇÃO DA BST: A INSERÇÃO RECURSIVA ---
  // Lógica: "Dado um nó e um valor, decida se o valor vai para a esquerda ou para direita."
  private Node insertRecursive(Node currentNode, int value) {
    // Caso Base 1: Se o nó atual é nulo, encontramos o lugar certo!
    // Criamos o novo nó aqui e o retornamos para ser "engatado" pelo pai.
    if (currentNode == null) {
      return new Node(value);
    }
    // Caso Recursivo: Se o nó não é nulo, então decidimos para onde ir.
    if (value < currentNode.value) {
      // O valor é menor, então ele pertence à sub-árvore esquerda.
      // Chamamos a função de novo para o filho da esquerda.
      // O resultado (o nó novo ou o próprio filho) é "engatado" de volta.
      currentNode.left = insertRecursive(currentNode.left, value);
    } else if (value > currentNode.value) {
      // O valor é maior, etão ele pertence à sub-árvore direita.
      currentNode.right = insertRecursive(currentNode.right, value);
    } else {

      // O valor já existe, não fazemos nada (BSTs geralmente não tem duplicatas).
      return currentNode;
    }
    return currentNode;

  }
  
  // ---PERCORRENDO A ÁRVORE (TRAVERSAL) ---
  // In-Order: Esquerda -> Raiz -> Direita. Resulta nos elementos EM ORDEM!
  public void printInOrder() {
    printInOrderRecursive(root);
    System.out.println(); // Pula uma linha no final.
  }

  private void printInOrderRecursive(Node node) {
    if (node != null) {
      printInOrderRecursive(node.left); // 1. Vai para a esquerda até o fim.
      System.out.println(node.value + " "); // 2. Imprime o nó atual.
      printInOrderRecursive(node.right); // 3. Vai para a direita.
    }
  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    // Inserindo elementos. Observe a ordem.
    bst.insert(50);
    bst.insert(30);
    bst.insert(70);
    bst.insert(20);
    bst.insert(40);
    bst.insert(60);
    bst.insert(80);

    // Ao imprimir em ordem, os números saem ordenados, provando que a estrutura funciona!
    System.out.println("Travessia In-Order (elementos ordenados): ");
    bst.printInOrder();
  }
}