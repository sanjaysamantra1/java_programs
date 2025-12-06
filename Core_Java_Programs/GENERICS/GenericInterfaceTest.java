interface DemoInterface<T1,T2>
{
   T2 doSomeOperation(T1 t);
   T1 doReverseOperation(T2 t);
}

class GenericInterfaceTest implements DemoInterface<String, Integer>
{
   public Integer doSomeOperation(String t)
   {
      Integer i = new Integer(5);
      return i;
   }
   public String doReverseOperation(Integer t)
   {
      return "hello";
   }

   public static void main(String[] args){
	   GenericInterfaceTest ob = new GenericInterfaceTest();
	   System.out.println(ob.doSomeOperation("hello Java"));
	   System.out.println(ob.doReverseOperation(10));

   }
}