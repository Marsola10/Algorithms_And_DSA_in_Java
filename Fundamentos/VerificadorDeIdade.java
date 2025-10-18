public class VerificadorDeIdade {
  
  public static void main(String[] args) {
    // Usando uma variável idade para verificar se a pessoa é maior de idade
    int idade = 20;

    System.out.println("Verificando a idade: " + idade);




    if (idade >= 18) {
      System.out.println("Acesso permitido! Você é maior de idade. ");

    } else {

      System.out.println("Acesso negado! Você é menor de idade. ");

    }

    // ----------Exemplo com mais uma condição-----------

    int nota = 85;
    System.out.println("\nVerificando a nota: " + nota);

    if (nota >= 90) {
      System.out.println("Nota A: Excelente!");

    } else if(nota >= 80){
      System.out.println("Nota B: Muito bom!");
    
    } else {
      
      System.out.println("Nota C: Precisa melhorar. ");
   }
  }
  
}
