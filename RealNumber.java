public class RealNumber{
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

  public boolean equals(RealNumber other){
    if (this.getValue() == 0 || other.getValue() == 0) {
      return this.getValue() == 0 && other.getValue() == 0;
    }
    double diff = Math.abs((this.getValue()-other.getValue())/this.getValue());
    return  diff < 0.00001;
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
