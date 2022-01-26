
public class PruebasValorYReferencia {

  public static void main(String[] args) {

    int x = 50;
    suma5(x);
    System.out.println("x del main " + x);
    int[] n = { 4, 7, 11, 22, 55, 60 };
    System.out.println("n del main: " + n);
  }

  public static void suma5(int x) {

    x = x + 5;
    System.out.println("x desde suma5 " + x);
  }

  public static void suma5(int[] n) {

    for (int i = 0; i < n.length; i++) {

      n[i] = n[i] + 5;
      System.out.println();
    }
  }
}
