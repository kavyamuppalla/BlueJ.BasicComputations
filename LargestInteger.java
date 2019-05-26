 
import java.lang.Math; 

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        if(integers[0] > integers[1] && integers[0] > integers[1]){
            return integers[0];
        }
        else if(integers[1] > integers[0] && integers[1] > integers[2]) {
            return integers[1];
        }
        else  {
            return integers[2];
        }
        //return integers[];
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
      return Math.max(Math.max(integers[0],integers[1]),integers[2]);
    }
  
}
