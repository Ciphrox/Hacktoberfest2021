import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
public class FindEvenUsingJava8 {
    
    public final static Function<List<Integer>, List<Integer>> findEven = (al) -> al.stream().filter((i)-> i%2==0).collect(Collectors.toList());
    
    public static void printList(List<Integer> al){
        Supplier<List<Integer>> supply = () -> al;
        supply.get().forEach((i) -> System.out.print(i + " "));
        System.out.println();
    }
    
    public static void findAndPrintEven(List<Integer> al){
        List<Integer> evenList = findEven.apply(al);
        printList(evenList);
    }
  
    public static void main(String args[]) {
        List<Integer> list1 = Arrays.asList(2,3,4);
        List<Integer> list2 = Arrays.asList(7,31,22,45,34,20,19,18);
        List<Integer> list3 = Arrays.asList(212,3124,542,878,8632,122,779);
        findAndPrintEven(list1);
        findAndPrintEven(list2);
        findAndPrintEven(list3);
    }
}
