package sumofnumbers;

import java.util.logging.Logger;

public class SumOfNumbers {
    
    private static final int NUMBER = 12345;
    private static Logger logger = Logger.getLogger(SumOfNumbers.class.getName());
    
    public static void main(String[] args) {
        
        //First method
        int sum1 = firstMethod(NUMBER);
        
        //Second method
        int sum2 = secondMethod(NUMBER);        
        
        logger.info("First method sum = " + sum1); 
        logger.info("Second method sum = " + sum2);
    } 
    
    private static int firstMethod(int n){
        int sum = 0;        
        while(n != 0){
            sum += n%10;
            n /= 10;            
        }
        return sum;
    }
    
    private static int secondMethod(int n){
        int sum = 0;
        String number = String.valueOf(n);
        char[] rowNumber =  number.toCharArray();
        for(int i = 0; i<rowNumber.length; i++){
            int numb = (int)rowNumber[i] - 48;
            sum += numb;
        }
        return sum;
   }    
}
