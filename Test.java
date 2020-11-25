public class Test {
  public static void testStuff(RealNumber a, RealNumber b) {
    String aS = a.toString();
    String bS = b.toString();
    System.out.println(aS);
    System.out.println(bS);
    System.out.println(aS + '=' + bS + '\n' + a.equals(b));
    System.out.println(aS + '+' + bS + '=' + a.add(b));
    System.out.println(aS + '-' + bS + '=' + a.subtract(b));
    System.out.println(aS + '*' + bS + '=' + a.multiply(b));
    System.out.println(aS + '/' + '(' + bS + ")=" + a.divide(b));
    System.out.println(a.add(b));
  }
  public static void main(String[] args) {
    RealNumber uno = new RealNumber(Double.parseDouble(args[0]));
    RealNumber dos = new RealNumber(Double.parseDouble(args[1]));
    RationalNumber tres = new RationalNumber(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
    RationalNumber cuatro = new RationalNumber(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
    //doStuff(uno, dos);
    System.out.println();
    testStuff(tres, cuatro);
  }
}
