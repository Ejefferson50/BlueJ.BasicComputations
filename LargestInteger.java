
public class LargestInteger {
    public Integer findLargestNumberUsingConditional(Integer[] integers){
         
         int max = 0;

        for(int i = 0; i < integers.length; i++){
            if(integers[i]> max)
                
            max = integers[i];

            
        }
        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int max = 0;

        for(int i = 0; i < integers.length; i++){
            if(integers[i]> max)
                
            max = integers[i];

            
        }
        return Math.max(0, max);
        
    }

}