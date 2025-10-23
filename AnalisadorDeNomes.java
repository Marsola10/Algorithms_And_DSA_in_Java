public class AnalisadorDeNomes {
  public static void main(String[] args) {

    String nomeCompleto = "Ana Clara da Silva";

    System.out.println("Analisando o nome: " + nomeCompleto + "'");

    // --- Usando os métodos da String ---

    // 1. .length(): Retorna o tamanho da string (número de caracteres).
    // Lógica: "String, me diga quantos caracteres você tem."
    int tamanho = nomeCompleto.length();
    System.out.println("1. Tamanho total: " + tamanho + " caracteres (incluindo espaços).");

    // 2. .charAt(indice): Retorna o caractere em uma posição específica.
    // Lógica: "String, me dê o caractere que está na gaveta (índice) 0."
    char primeiraLetra = nomeCompleto.charAt(0);
    System.out.println("2. A primeira letra é: " + primeiraLetra + "'.");
    
    
    // 3. .toUpperCase(): Retorna uma NOVA string com tudo em maiúsculas.
    // Lógica: "String, crie uma cópia de você mesma toda em maiúsculas."
    String nomeMaiusculo = nomeCompleto.toUpperCase();
    System.out.println("3. Nome em maiúsculas: " + nomeMaiusculo);
    System.out.println(" (A String original não mudou: " + nomeCompleto + ")");

    // 4. .startsWith("prefixo"): Verifica se a string começa com um texto. Retorna boolean (true/false).
    // Lógica: "String, é verdade que você começa com 'Ana'?"
    boolean comecaComAna = nomeCompleto.startsWith("Ana");
    System.out.println("4. O nome começa com 'Ana'? " + comecaComAna);
    
    // 5. .split("separador"): Quebra a string em um ARRAY de strings menores, usando um separador.
    // Lógica: "String, quebre-se em pedaços toda vez que encontrar um espaço ' ' e me dê esses pedaços em um array."
    String[] partesDoNome = nomeCompleto.split(" ");
    System.out.println("5. O primeiro nome é: " + partesDoNome[0]);
    System.out.println(" O último nome é: " + partesDoNome[3]);


  
  }
  
}
