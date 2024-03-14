import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                
            }
            
        };

     
        System.out.println("result of the Comparable is : "+ comparator.compare(2,3));

        // Using lambda

        Comparator<Integer> lambdComparator = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("result of the comparable using Lambda is :" + lambdComparator.compare(3,2));

        Comparator<Integer> lambdComparator1 = (a, b) -> a.compareTo(b);
        System.out.println("result of the comparable using Lambda is :" + lambdComparator1.compare(3, 3));

    }

    
}
