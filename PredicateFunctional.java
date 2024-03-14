import java.util.function.Predicate;

/**
 * PredicateFunctional
 */
public class PredicateFunctional {

    static Predicate<Integer> p1 = (i) ->  i%2==0;

    static Predicate<Integer> p2 = (i) -> i%3==0;

    public static void predicateAnd(){
        System.out.println("The result of and method in predocate is :"+ p1.and(p2).test(4)); // predicate chaining 
    }

    public static void predicateOr(){
        System.out.println("The result of or method in predocate is :"+p1.or(p2).test(4));
    }

    public static void predicateNegate(){
        System.out.println("The result of negate method in predocate is :"+p1.or(p2).negate().test(4));
    }


    

    public static void main(String[] args) {
        
       



        System.out.println(p1.test(4));
        System.out.println(p2.test(9));

        predicateAnd();
        predicateOr();


    }
}