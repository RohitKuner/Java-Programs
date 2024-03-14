import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * TrywithResource
 */
public class TrywithResource {

    public static void main(String[] args) throws Exception {
        
        beforejava7();
        injava7();
         
    }
    /*
     * sample implementaion of before java7 
     * @throws IOException
     */

   
    public static void beforejava7() throws IOException{
        BufferedReader bf = null;
        try{
            bf = new BufferedReader(new FileReader("C:/Users/rohitk/Desktop/java7 features/java7.txt.txt"));
            String sCurrentLine;
            while((sCurrentLine = bf.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }

        finally{
            bf.close();
        }        
    }
    /*
     * Sample implementaion injava7
     * @FileNotFoundException, IOException
     */



    public static void injava7() throws FileNotFoundException, IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("C:/Users/rohitk/Desktop/java7 features/java7.txt.txt"))){
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                
            }
        }

    }
       


    
}
