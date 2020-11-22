public class Test {
  public static void main(String[] args) {
    RealNumber bob = new RealNumber(Double.parseDouble(args[0]));
    RealNumber joe = new RealNumber(Double.parseDouble(args[1]));
    System.out.println(bob.equals(joe));
  }
}
