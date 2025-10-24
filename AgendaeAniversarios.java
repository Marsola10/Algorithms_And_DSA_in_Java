import java.util.*;
public class AgendaeAniversarios {
  public static void main(String[] args) {
      // --- Criando um HashMap ---
      // A sintaxe <String, String> significa:
      // A Chave (Key) será uma String (o nome da pessoa).
      // O Valor (Value) também será uma String (a data do aniversário).

      Map<String, String> aniversarios = new HashMap<>();
     
    // --- Adicionando entradas (pares Chave-Valor) ---
     // Usamos o método .put(chave, valor).
     // Lógica: "Agenda, guarde que a chave 'João' está associada ao valor '15 de Março'."

    aniversarios.put("João ", " 15 de Março");
    aniversarios.put("Maria ", " 22 de Junho");
    aniversarios.put("Pedro ", " 5 de Dezembro");

    System.out.println("Agenda completa: " + aniversarios);
    
    // --- Buscando um Valor pela Chave ---
    // Usamos o método .get(chave). É aqui que a mágica acontece.
    // Lógica: "Agenda, me dê o valor associado à chave 'Maria'."
    String aniverDaMaria = aniversarios.get("Maria ");
    System.out.println("\nO aniversário da Maria é: " + aniverDaMaria);

    // Se a chave não existe, .get() retorna 'null' (nulo, vazio).
    String aniverDoCarlos = aniversarios.get("Carlos ");
    System.out.println("O aniversário do Carlos é: " + aniverDoCarlos);
    
    // --- Verificando se uma Chave existe ---
    // Usamos .containsKey(chave).
    // Lógica: "Agenda, é verdade que você tem uma entrada para a chave 'Pedro'?"
        if (aniversarios.containsKey("Pedro ")) {
          System.out.println("Sim, eu tenho o aniversário do Pedro cadastrado na agenda. ");

        }
    
    // --- Removendo uma entrada ---
    // Lógica: "Agenda, remova a entrada inteira (chave e valor) da chave 'João'."
    aniversarios.remove("João ");
    System.out.println("\nAgenda após remover o João: " + aniversarios);
    
    // --- Percorrendo o HashMap ---
    // É um pouco diferente de um array, pois não há ordem de índices.
    System.out.println("\n--- Todos os aniversários da Agenda ---");
    
    // 'aniversarios.keySet()' nos dá um conjunto com todas as chaves ("Maria", "Pedro").
    for (String nome : aniversarios.keySet()) {
      // Para cada nome (chave), pegamos o valor correspondente.
      
      String data = aniversarios.get(nome);
      System.out.println("O aniversário de " + nome + " é em " + data);
    }

    }
}
