class Odemo12
{
  int getsq(int x)
  {
    int sq=x*x;
    return(sq);
  }
  public static void main(String args[])
  {
   Odemo12 d=new Odemo12();
   int i=d.getsq(3);
   System.out.println("square of 3 is: "+i);
   System.out.println("d.getsq(4+1) is: "+d.getsq(4+1));
   System.out.println("square of 6 is: "+d.getsq(6));
   int k=d.getsq(7)+1;
   System.out.println(k);
   System.out.println(d.getsq(8)+1);
  }
}
