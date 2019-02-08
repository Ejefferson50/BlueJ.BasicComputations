

import java.math.BigInteger;


public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger x = BigInteger.valueOf(1);
        for(int i = 1; i <=value; i++)
            x = x.multiply(BigInteger.valueOf(i));

            return x;
            
    } 
    

}

