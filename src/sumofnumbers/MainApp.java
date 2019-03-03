package sumofnumbers;

import java.util.logging.Logger;

public class MainApp {
    
    private static final int NUMBER = 12345;
    private static Logger logger = Logger.getLogger(SumOfNumbers.class.getName());
    
    public static void main(String[] args) {
        
        //First method
        int sum1 = SumOfNumbers.firstMethod(NUMBER);
        
        //Second method
        int sum2 = SumOfNumbers.secondMethod(NUMBER);        
        
        logger.info("First method sum = " + sum1); 
        logger.info("Second method sum = " + sum2);
    }
}
