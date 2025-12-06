	abstract  class Cars
    {
        //put all the common functions but diffrent implementation in  abstract method.
        public abstract double price();
        public abstract int getTotalSeat();
        public abstract String colors();

        //put all the common property in normal class
        public String Wheel()
        {
            return "4 wheeler";

        }
        public String CheckAC()
        {
            return "AC is available";
        }
        public String CallFacility()
        {
            return "Call Facility  supported";
        }
   }

   class Toyota extends Cars
       {
           public String DiscountPrice()
           {
               return "20% discount on buying Toyoya Cars";
           }
           public double price()
           {
               return 1000000.00;
           }
           public  int getTotalSeat()
           {
               return 5;
           }
           public  String colors()
           {
               return "Red";
            }
   public static void main(String args[])
   {
	   Toyota ob=new Toyota();
	   System.out.println(ob.Wheel());
	   System.out.println(ob.CheckAC());
	   System.out.println(ob.CallFacility());

	   System.out.println(ob.DiscountPrice());
	   System.out.println(ob.price());
	   System.out.println(ob.getTotalSeat());
	   System.out.println(ob.colors());
   }
}
