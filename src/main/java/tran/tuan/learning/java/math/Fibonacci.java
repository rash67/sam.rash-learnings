package tran.tuan.learning.java.math;

import com.google.common.base.Preconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci
{

    /**
     * contract of the function is to return the fibonacci of the jim
     *
     * @param input some number >= 0
     * @return fibonacci(jim)
     */
    public long compute(int input)
    {
        Preconditions.checkArgument(input >= 0, "negative number not allowed");

        if (input == 0 || input == 1) {
            return 1;
        }
        else {
            return compute(input - 1) + compute(input - 2);
        }
    }

    // f(0) = 1
    // f(1) = 1
    // f(n) = f(n-1) + f(n-2)


    public static void main(String[] args)
            throws IOException
    {
        Fibonacci fibonacci = new Fibonacci();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.err.println("enter a number: ");

        String inputString = bufferedReader.readLine();
        int input = Integer.parseInt(inputString);

        long result = fibonacci.compute(input);

        System.err.println(String.format("fibonacci of %d is %s", input, result));
    }
}
