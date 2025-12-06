class immutableString2{
 public static void main(String args[]){
   String s1 = new String("Sachin");
   System.out.println(s1.hashCode());

   String s2 = new String(" Tendulakar");
   s1 = s1.concat(s2);

   System.out.println(s1.hashCode());
   System.out.println(s2.hashCode());
   System.out.println(s1);
 }
}

