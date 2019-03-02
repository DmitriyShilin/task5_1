package sumofnumbers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SumOfNumbers {
    
    private static final int NUMBER = 12345;
    private static Logger LOGGER = null;
    private static FileHandler handler = null;

    public static void main(String[] args) {
        
        //First method
        int sum1 = firstMethod(NUMBER);
        
        //Second method
        int sum2 = secondMethod(NUMBER);        
        
        try {
            handler = new FileHandler("C:/log/SumOfNumbers.log", false);            
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(SumOfNumbers.class.getName()).log(Level.SEVERE, ex.toString(), ex);
        } 
        handler.setFormatter(new SimpleFormatter());
        LOGGER = Logger.getLogger(SumOfNumbers.class.getName());
        LOGGER.addHandler(handler);
        LOGGER.setLevel(Level.INFO);
        LOGGER.setUseParentHandlers(false);
        
        //What is better?
        LOGGER.info("First method sum = " + sum1); 
        LOGGER.log(Level.INFO, "Second method sum = {0}", sum2);
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
