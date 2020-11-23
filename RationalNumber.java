public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    reduce();
  }

  public double getValue(){
    return ((double) numerator) / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return numerator == other.getNumerator() && denominator == other.getDenominator();
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    String output = "" + numerator;
    if (denominator != 1) {
      output += "/" + denominator;
    }
    return output;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcdOrdered(int a, int b) {
    int r = a % b;
    if (r == 0) {
      return b;
    }
    return gcdOrdered(b, r);
  }
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    if (a > b) {
      return gcdOrdered(a, b);
    }
    return gcdOrdered(b, a);
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    if (numerator == 0) {
      denominator = 1;
    }
    else {
      int gcd = gcd(numerator, denominator);
      numerator /= gcd;
      denominator /= gcd;
      if (denominator < 0) {
        numerator *= -1;
        denominator *= -1;
      }
    }
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int otherDenominator = other.getDenominator();
    int gcd = gcd(denominator, otherDenominator);
    int mult1 = otherDenominator / gcd;
    int mult2 = denominator / gcd;
    return new RationalNumber(numerator * mult1 + other.getNumerator() * mult2, mult1 * mult2);
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  private RationalNumber negative() {
    return new RationalNumber(- numerator, denominator);
  }
  public RationalNumber subtract(RationalNumber other){
    return add(other.negative());
  }
}
