class Dimension<T>
{
   private T length;
   private T width;
   private T height;

   //Generic constructor
   public Dimension(T length, T width, T height)
   {
      super();
      this.length = length;
      this.width = width;
      this.height = height;
   }
   public void get(){
	   System.out.println(length+"  "+width+"  "+height);
   }
}
class GenericConstructorTest
{
	public static void main(String[] args){
	   Dimension<Integer> ob = new Dimension<Integer>(4,5,3);
	   Dimension<Double> ob2 = new Dimension<Double>(4.5,5.2,3.8);
	   Dimension ob3 = new Dimension(4,5.2,3.8f);
	   ob.get();
	   ob2.get();
	   ob3.get();
	}
}