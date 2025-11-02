// Primeiro, definimos o que é um "Nó" (o nosso vagão de trem ou galho da árvore).
// É uma classe que representa cada elemento na árvore.

public class Node {
  int value;  // O dado que o nó armazena
  Node left;  // O ponteiro para o filho da esquerda (menor)
  Node right; // O ponteiro para o filho da direita (maior)


  // Construtor: cria um novo nó com um valor.
  public Node(int value) {
    this.value = value;
    this.left = null; // Um novo nó começa sem filhos.
    this.right = null;
  }
  
}
