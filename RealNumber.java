public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public RealNumber add(RealNumber other){
     RealNumber ans = new RealNumber(this.getValue() + other.getValue());
     return ans;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber ans = new RealNumber(this.getValue() * other.getValue());
    return ans;
  }

  public RealNumber divide(RealNumber other){
    RealNumber ans = new RealNumber(this.getValue() / other.getValue());
    return ans;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber ans = new RealNumber(this.getValue() - other.getValue());
    return ans;
  }
}
