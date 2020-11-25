public abstract class Number{
  public abstract double getValue();
  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  //public int compareTo(Number other){
    //TO BE IMPLEMENTED
  //}

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  private double percentageDifference(double a, double b) {
    return Math.abs(a - b) * 200 / (a + b);
  }
  public boolean equals(RealNumber other){
    double value = getValue();
    double otherValue = other.getValue();
    if (value == 0.0) {
      return otherValue == 0.0;
    }
    return percentageDifference(value, otherValue) <= 0.001;
  }
}
