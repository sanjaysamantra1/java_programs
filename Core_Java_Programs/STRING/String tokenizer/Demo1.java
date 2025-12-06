import java.util.StringTokenizer;

class Demo1{
	 public static void main(String args[]) {
	  String s = "this is java class";
	  StringTokenizer ob = new StringTokenizer(s,"");

	  System.out.println(ob.countTokens());

	  while(ob.hasMoreTokens()){
		  String res = ob.nextToken();
		  System.out.println(res);
	  }
	}
}
//  ob = ["this","is","java","class"]