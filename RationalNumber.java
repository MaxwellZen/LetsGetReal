public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else {
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue(){
    return (double) numerator / denominator;
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
    RationalNumber ans = new RationalNumber(this.denominator, this.numerator);
    return ans;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    reduce(); other.reduce();
    return numerator == other.numerator && denominator == other.denominator;
  }

  public String toString(){
    if (getValue()<0) return "-" + Math.abs(numerator) + "/" + Math.abs(denominator);
    return "" + numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    int newa = b % a;
    int newb = a;
    int placeholder;
    while (newa != 0) {
      placeholder = newa;
      newa = newb % newa;
      newb = placeholder;
    }
    return newb;
  }

  private void reduce(){
    int common = gcd(numerator, denominator);
    numerator = numerator / common;
    denominator = denominator / common;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber ans = new RationalNumber(numerator*other.numerator, denominator*other.denominator);
    ans.reduce();
    return ans;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber ans = new RationalNumber(numerator*other.denominator, denominator*other.numerator);
    ans.reduce();
    return ans;
  }

  public RationalNumber add(RationalNumber other){
    RationalNumber ans = new RationalNumber(numerator*other.denominator + denominator*other.numerator, denominator*other.denominator);
    ans.reduce();
    return ans;
  }

  public RationalNumber subtract(RationalNumber other){
    RationalNumber ans = new RationalNumber(numerator*other.denominator - denominator*other.numerator, denominator*other.denominator);
    ans.reduce();
    return ans;
  }
}
