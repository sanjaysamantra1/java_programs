class Interest
{
 public static void main(String args[])
 {
  double p=1000,t=5,r=5,ci;
  ci=p*Math.pow((1+r/100),t)-p;
  System.out.println("Compound interest is: "+ci);
 }
}

