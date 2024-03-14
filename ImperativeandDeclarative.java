import java.util.stream.IntStream;

public class ImperativeandDeclarative {

    public static void main(String[] args) {
        
        // sum 0 to 100 

        // imperative style 

        int sum = 0;
        for(int i=0; i<=100; i++){
            sum+=i;
        }
        System.out.println("Result in Imperative style:"+ sum);

        // Declarative style 

        int sum1 =IntStream.rangeClosed(0, 100).sum();

        System.out.println("Result in Declarative style:"+ sum1);

        System.out.println("rohuth kabna");
    }
    
}
