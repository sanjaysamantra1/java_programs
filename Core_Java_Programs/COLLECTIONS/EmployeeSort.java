import java.util.*;

class AgeComparator implements Comparator < Employee > {
 public int compare(Employee a, Employee b) {

  return a.getName().compareTo(b.getName());
 }

}

class EmployeeSort {
 public static void main(String[] args) {

  ArrayList list = new ArrayList();
  list.add(new Employee(102, "sanjay", 4500));
  list.add(new Employee(104, "ajay", 5400));
  list.add(new Employee(103, "deepak", 6700));
  list.add(new Employee(101, "rajesh", 4300));
  System.out.println(list);
  System.out.println();

  Collections.sort(list, new AgeComparator());

  System.out.println(list);

 }
}