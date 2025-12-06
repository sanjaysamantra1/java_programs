import java.util.HashSet;
import java.util.Set;

public class HashsetFindDups {
  public static void main(String[] args) {
		
    String str[]={"java","java2","javac","java","javap","java2"};

    Set<String> s = new HashSet<String>();
    for (String a : str)
      if (s.add(a)!=true)
        System.out.println("Duplicate detected: " + a);

    System.out.println(s.size() + " distinct words: " + s);
  }
}