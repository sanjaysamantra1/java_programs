import java.util.*;

class MyComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2) {
        return e2.getName().compareTo(e1.getName());
    }
}

public class SortEmployeeList {

    public static void main(String a[]){

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(101,"sanjay",20000));
        list.add(new Employee(104,"ajit",15000));
        list.add(new Employee(103,"deepak",25000));
        list.add(new Employee(102,"pradeep",40000));

        System.out.println("Before sort: ");
		 for(Employee e:list){
		    System.out.println(e);
        }
		MyComparator comp = new MyComparator();
        Collections.sort(list,comp);

        System.out.println("\nSorted list entries: ");
        for(Employee e:list){
            System.out.println(e);
        }
    }
}


