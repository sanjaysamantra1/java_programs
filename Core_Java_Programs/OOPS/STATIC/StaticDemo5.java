//execute a program without main() method

// if JDK 1.7 and above
// Output:Error: Main method not found in class A3, please define the main method as:

//public static void main(String[] args)

class StaticDemo5{  
  static{  
  System.out.println("static block is invoked");  
  System.exit(0);  
  }  
}