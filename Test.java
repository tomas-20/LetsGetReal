public class Test {
  public static void main(String[] args) {
    RealNumber uno = new RealNumber(Double.parseDouble(args[0]));
    RealNumber dos = new RealNumber(Double.parseDouble(args[1]));
    RationalNumber tres = new RationalNumber(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
    RationalNumber cuatro = new RationalNumber(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
    System.out.println(uno.equals(dos));
    System.out.println(uno.add(dos));
    System.out.println(uno.multiply(dos));
    System.out.println(uno.divide(dos));
    System.out.println(uno.subtract(dos));
    System.out.println(tres);
    System.out.println(cuatro);
    System.out.println(tres.equals(cuatro));
    System.out.println(tres.reciprocal());
  }
}
