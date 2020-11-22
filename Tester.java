public class Tester {
  public static void main (String[] args) {
    RealNumber a = new RealNumber(5);
    RealNumber b = new RealNumber(5.0000000001);
    System.out.println(a.equals(b));
    RationalNumber c = new RationalNumber(500000001, 100000000);
    System.out.println(a.equals(c));
    System.out.println(b.equals(c));
    System.out.println(c.reciprocal());
    System.out.println(b.subtract(a));
    RationalNumber d = new RationalNumber(15, 9);
    System.out.println(d);
    RationalNumber e = new RationalNumber(1, 6);
    System.out.println(d.subtract(e));
    System.out.println(d.divide(e));
    RationalNumber f  = new RationalNumber(0, 100);
    System.out.println(f);
  }
}
