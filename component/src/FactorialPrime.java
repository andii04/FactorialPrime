import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialPrime {

    // static instance

    private static FactorialPrime instance = new FactorialPrime();

    public static FactorialPrime getInstance() {
        return instance;
    }

    // define port

    public Port port;

    private FactorialPrime() {
        port = new Port();
    }

    private ArrayList<BigInteger> calculateFactorialPrime(BigInteger rangeFrom, BigInteger rangeTo)
    {

        /*
        ArrayList<BigInteger> EvilNumbers = new ArrayList<>();


        for(;rangeFrom.compareTo(rangeTo)<=0; rangeFrom = rangeFrom.add(BigInteger.ONE))
        {

            //if(rangeFrom.mod(BigInteger.TWO) != BigInteger.ZERO)
            //{
            BigInteger count = new BigInteger("0");
            String s = rangeFrom.toString(2);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='1') {
                    count = count.add(BigInteger.ONE);

                }

            }
            if(count.mod(BigInteger.TWO) == BigInteger.ZERO)
            {
                EvilNumbers.add(rangeFrom);
                System.out.println(rangeFrom);
            }


            // }


        }
        */
        return null;
    }


    public class Port implements IFactorialPrime {


        @Override
        public ArrayList<BigInteger> execute(BigInteger rangeFrom, BigInteger rangeTo) {

            ArrayList<BigInteger> FactorialPrime = new ArrayList<>();
            //System.out.println("execute methode");
            return calculateFactorialPrime(rangeFrom, rangeTo);
        }
    }
}
