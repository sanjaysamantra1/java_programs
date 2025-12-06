class TernaryDemo2
{
 public static void main(String args[])
 {
  int a=12,b=18,c=15,gst;
  gst=(a>b && a>c)?a:(b>c)?b:c;
  System.out.println("Gretest is: "+gst);
 }
}