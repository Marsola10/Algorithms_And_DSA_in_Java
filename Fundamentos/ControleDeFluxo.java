// Controle de fluxo: if, for, while
// Conta quantos números pares existem em um array
public class ControleDeFluxo {
  static int contarPares(int[] nums) {
    int c = 0;
    for (int x : nums) {
      if (x % 2 == 0) {
        c++;

      }
    }
    return c;
  }
  public static void main(String[] args) {

    System.out.println(contarPares(new int[] { 2, 3, 4, 8 }));

  
  
  }
  
}
