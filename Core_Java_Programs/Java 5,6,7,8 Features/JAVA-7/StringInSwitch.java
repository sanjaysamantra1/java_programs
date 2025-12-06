class StringInSwitch{

public static void main(String args[])
{
	String x="bangalor";

       switch(x) {
           case "bangalore":
               System.out.println("it is Bangalore");
               break;
           case "chennai":
               System.out.println("it is Chennai");
               break;
           case "hyderabad":
               System.out.println("it is Hyderabad");
               break;
           default:
                System.out.println("it is Default Case");
                break;
       }
   }
}