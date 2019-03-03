package sumofnumbers;

public class SumOfNumbers {
    
    public static int firstMethod(int n){
        int sum = 0;        
        while(n != 0){
            sum += n%10;
            n /= 10;            
        }
        return sum;
    }
    
    public static int secondMethod(int n){
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
