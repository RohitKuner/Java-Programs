import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeandDeclarative2 {



    public static void main(String[] args) {

        // find the duplicate numbers in list 

        // using imperative style

        List<Integer> listintegr = Arrays.asList(1,2,3,4,8,8,2,3,4,1,2);

        List<Integer> uniqueInteger = new ArrayList<>();

        for(Integer integer : listintegr){
            if(!uniqueInteger.contains(integer)){
                uniqueInteger.add(integer);
            }
        }
        System.out.println("uniqueInteger: "+uniqueInteger);

        // using declarative style

        List<Integer> uniqueInteger1 = listintegr.stream().distinct().collect(Collectors.toList());

        System.out.println("uniqueInteger1:"+ uniqueInteger1);


        

        
    }
    
}
